package com.deliverytech.delivery_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@OpenAPIDefinition(
	info = @Info(
		title = "API de Delivery",
		version = "1.0.0",
		description = "Documentação da API para gerencimeanto de clientes"
)
)
@SpringBootApplication
public class DeliveryApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeliveryApiApplication.class, args);
	}

}
