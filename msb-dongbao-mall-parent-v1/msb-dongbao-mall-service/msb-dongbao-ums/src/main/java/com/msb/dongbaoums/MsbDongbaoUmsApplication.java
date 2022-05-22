package com.msb.dongbaoums;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.msb"})
@MapperScan("com.msb.dongbaoums.mapper")
public class MsbDongbaoUmsApplication {
	public static void main(String[] args) {
		SpringApplication.run(MsbDongbaoUmsApplication.class, args);
	}


}