package com.order;

import com.order.nabsys.OrderRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class OrderApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(OrderApplication.class, args);
		OrderRepository orderRepository = context.getBean(OrderRepository.class);

		orderRepository.findAll()
				.forEach(System.out::println);

	}

}
