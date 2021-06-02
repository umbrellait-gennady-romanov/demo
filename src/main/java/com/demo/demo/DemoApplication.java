package com.demo.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext app = SpringApplication.run(DemoApplication.class, args);
		Client client = app.getBean(Client.class);
		client.printName();
	}
}
