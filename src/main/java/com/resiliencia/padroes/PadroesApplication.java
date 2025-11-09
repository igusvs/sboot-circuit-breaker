package com.resiliencia.padroes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class PadroesApplication {

	public static void main(String[] args) {
		SpringApplication.run(PadroesApplication.class, args);
	}

}
