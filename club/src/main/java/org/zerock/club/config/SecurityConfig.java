package org.zerock.club.config;

import lombok.extern.log4j.Log4j2;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@Log4j2
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/*").permitAll()
                .antMatchers("/sample/admin").hasRole("ADMIN")
                .antMatchers("/sample/member").authenticated();

        http.formLogin(); // 로그인 페이지로 리다이렉트
    }





}
