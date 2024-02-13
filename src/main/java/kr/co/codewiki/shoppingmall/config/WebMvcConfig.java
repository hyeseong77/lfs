package kr.co.codewiki.shoppingmall.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    // 아까 application.properties 에 적었던 uploadPath 여기다가 대입
    @Value("${uploadPath}")
    String uploadPath;

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/images/item/**") // 웹 URL 경로
                .addResourceLocations("file:/show/shoping1/src/main/resources/static/item/"); // 실제 파일 시스템 경로
    }

}