package com.assignment.productFeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ProductFeign1Application {

	public static void main(String[] args) {
		SpringApplication.run(ProductFeign1Application.class, args);
	}

}
