package com.sayat.tipbox;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "TipBox Apı Test",version = "1.0", description = "TipBox Management"))
public class TipboxApplication {

	public static void main(String[] args) {
		SpringApplication.run(TipboxApplication.class, args);
	}

	}
