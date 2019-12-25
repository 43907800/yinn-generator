package com.yinn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.yinn.dao")
public class GuardsApplication {

	public static void main(String[] args) {
		SpringApplication.run(GuardsApplication.class, args);
	}
}
