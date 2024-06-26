package com.example.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
public class CorsConfig {

    @Bean
    public CorsFilter corsFilter(){
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration();
        config.setAllowCredentials(true);  // 인증처리 허용
        config.addAllowedOrigin("*");  // 도메인 허용
        config.addAllowedMethod("*");  // http Method 허용
        config.addAllowedHeader("*");  // 헤더 허용

        source.registerCorsConfiguration("*" , config);
        return new CorsFilter(source);
    }
}
