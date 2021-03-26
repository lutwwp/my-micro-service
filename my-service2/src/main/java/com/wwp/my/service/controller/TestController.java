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

    @GetMapping("/normal")
    public String normal( ) {
        return "service2 normal test success!";
    }


    @GetMapping("/admin")
    @PreAuthorize("hasAuthority('ADMIN')")
    public String admin() {
        return "service2 permission test success!";
    }
}
