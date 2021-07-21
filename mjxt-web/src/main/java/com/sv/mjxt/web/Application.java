package com.sv.mjxt.web;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.scheduling.annotation.EnableScheduling;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@EnableScheduling
@SpringBootApplication
@MapperScan("com.sv.mjxt.web.mapper")
public class Application {

	private static final Logger logger = LoggerFactory.getLogger(Application.class);

	//Test
	public static void main(String[] args) throws Exception {
		logger.info("Server starting...");
		SpringApplication.run(Application.class, args);
		logger.info("Server started!");
	}
}
