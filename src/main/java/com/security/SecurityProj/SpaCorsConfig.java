package com.security.SecurityProj;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class SpaCorsConfig implements WebMvcConfigurer {

    // Enable CORS globally
    @Override
    public void addCorsMappings(CorsRegistry registry) {

        registry.addMapping("/api/*")
                .allowedOrigins("http://localhost:3000")       // http://localhost:3000/
                .allowedMethods("")       // "GET", "POST", "PUT", "DELETE"
                .allowedHeaders("*")
                .allowCredentials(true);
    }
}