package com.msb.dongbaoums;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
@MapperScan("com.msb.dongbaoums.mapper")
@Component("com.msb.dongbaoums.config")
public class MsbDongbaoUmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsbDongbaoUmsApplication.class, args);
	}

}