package com.finiteloop.in.finiteloop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
//@ComponentScan("com.finiteloop.in.finiteloop")
@EnableAutoConfiguration
public class FiniteloopApplication {

	public static void main(String[] args) {
		SpringApplication.run(FiniteloopApplication.class, args);
	}

}
