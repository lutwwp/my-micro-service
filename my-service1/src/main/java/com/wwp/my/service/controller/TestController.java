package com.wwp.my.service.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName TestController
 * @Description: TODO
 * @Author wwp
 * @Date 2021-03-26
 * @Version V1.0
 **/
@RestController
public class TestController {
    /**
     * 在SeccurityConfig中配置是否需要认证即可访问，
     * 如果需要认证，返回登录页进行登录然后再获取access_token
     * 将用户信息保存在access_token(JWT)，并于SecurityContextHolder中的信息进行校验，
     *
     *
     * @PreAuthorize("hasAuthority('ADMIN')")
     * 使用该注解验证当前用户是否有权限访问该方法
     *
     */

    @GetMapping("/normal")
    public String normal( ) {
        return "service1 normal test success!";
    }


    @GetMapping("/admin")
    @PreAuthorize("hasAuthority('ADMIN')")
    public String admin() {
        return "service1 permission test success!";
    }
}
