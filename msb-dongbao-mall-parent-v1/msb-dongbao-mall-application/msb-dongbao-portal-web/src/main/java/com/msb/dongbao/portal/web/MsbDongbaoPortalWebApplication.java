package com.msb.dongbao.portal.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.context.annotation.ApplicationScope;

/**
 * @Auther: li
 * @Date: 2022/5/21 - 05 - 21 - 15:38
 * @Description: com.msb
 * @version: 1.0
 */
@SpringBootApplication(scanBasePackages = {"com.msb"})
@MapperScan("com.msb.dongbaoums.mapper")
public class MsbDongbaoPortalWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(MsbDongbaoPortalWebApplication.class, args);
    }

}

