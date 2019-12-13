package com.aaa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @version v1.0
 * @ProjectName: springboot_13
 * @ClassName: ApplicationStart
 * @Description: TODO(一句话描述该类的功能)
 * @Author: Administrator
 * @Date: 2019-11-27 18:15
 */
@SpringBootApplication
@MapperScan("com.aaa.dao")
public class ApplicationStart {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationStart.class);
    }
}
