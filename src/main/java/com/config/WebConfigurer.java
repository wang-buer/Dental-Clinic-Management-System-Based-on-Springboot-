package com.config;

import com.interceptor.AuthorizationInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfigurer implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 拦截所有请求，通过判断是否有 @LoginRequired 注解 决定是否需要登录
        registry.addInterceptor(getInterceptor()).addPathPatterns("/**").
                excludePathPatterns("/upload","/front");

    }

    @Bean
    public AuthorizationInterceptor getInterceptor(){
        System.out.println("注入了handler");
        return new AuthorizationInterceptor();
    }
}
