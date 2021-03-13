package com.cg.customerms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.cg.customerms.ui.ConsoleUI;

@SpringBootApplication
public class CustomermsApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(CustomermsApplication.class, args);
		
		ConsoleUI ui = context.getBean(ConsoleUI.class);
		ui.start();
	}

}
