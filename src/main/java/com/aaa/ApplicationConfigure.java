package com.aaa;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @version v1.0
 * @ProjectName: springboot_13
 * @ClassName: ApplicationConfigure
 * @Description: TODO(一句话描述该类的功能)
 * @Author: Administrator
 * @Date: 2019-12-01 18:18
 */
@Configuration
public class ApplicationConfigure  implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/upload/**").addResourceLocations("file:G:/upload/");
    }
}
