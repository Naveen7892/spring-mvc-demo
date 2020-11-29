package com.finiteloop.in.finiteloop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
//import org.springframework.boot.autoconfigure.domain.EntityScan;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@Configuration
@ComponentScan("com.finiteloop.in.finiteloop")
@EnableAutoConfiguration
//@EnableJpaRepositories
//@ComponentScan(basePackages = "*")
//@ComponentScan("com.finiteloop.in.finiteloop")
//@EntityScan("com.finiteloop.in.finiteloop")
//@EnableJpaRepositories("com.finiteloop.in.finiteloop")
public class FiniteloopApplication {

	public static void main(String[] args) {
		SpringApplication.run(FiniteloopApplication.class, args);
	}

}
