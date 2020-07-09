package com.product;

import com.product.nabsys.ProductRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ProductApplication {

	public static void main(String[] args) {
//		SpringApplication.run(ProductApplication.class, args);
		ConfigurableApplicationContext context = SpringApplication.run(ProductApplication.class, args);
		ProductRepository productRepository = context.getBean(ProductRepository.class);

		productRepository.findAll()
				.forEach(System.out::println);
	}

}
