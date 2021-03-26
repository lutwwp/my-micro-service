package com.wwp.my.authentication.service;

import com.wwp.my.authentication.entity.User;
import com.wwp.my.authentication.mapper.MyUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

/**
 * @ClassName MyUserDetailsService
 * @Description: TODO
 * @Author wwp
 * @Date 2021-03-25
 * @Version V1.0
 **/
@Component
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private MyUserMapper myUserMapper;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user = myUserMapper.getUserByUserName(s);
        if(user == null){
            throw new UsernameNotFoundException("数据库中无此用户！");
        }
        return user;
    }
}
