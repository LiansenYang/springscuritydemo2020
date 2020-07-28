package com.example.springscuritydemo2020.security;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;


@Component
@Slf4j
public class MyUserDetailsService implements UserDetailsService {

    @Resource
    PasswordEncoder passwordEncoder;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //根据用户名查找用户信息
        log.info("登录用户名:"+username);
        String password = passwordEncoder.encode("123456");
        log.info("密码是："+password);
        log.info("注意：passwordEncoder.encode(\"123456\")，应该是注册的时候做的，password的值应该是从数据库直接查出来的加密的hash串");
        return new User(username,password, AuthorityUtils.commaSeparatedStringToAuthorityList("ADMIN"));
    }
}
