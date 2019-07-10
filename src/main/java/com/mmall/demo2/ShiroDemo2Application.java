package com.mmall.demo2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
@MapperScan(basePackages = {"com.mmall.demo2.mapper"})
public class ShiroDemo2Application {

	public static void main(String[] args) {
		SpringApplication.run(ShiroDemo2Application.class, args);
	}

}
