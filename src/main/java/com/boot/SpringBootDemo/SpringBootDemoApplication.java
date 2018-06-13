package com.boot.SpringBootDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.boot.SpringBootDemo.controller","com.output","com.input","sample.aop.service","sample.aop.monitor","com.devglan.controller","com.devglan.service","com.devglan.dao","com.devglan.service.impl"})
@EntityScan(basePackages="com")
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}
}
