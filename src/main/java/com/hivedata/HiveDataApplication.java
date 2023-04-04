package com.hivedata;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hivedata.mbg.mapper")
public class HiveDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(HiveDataApplication.class, args);
	}

}
