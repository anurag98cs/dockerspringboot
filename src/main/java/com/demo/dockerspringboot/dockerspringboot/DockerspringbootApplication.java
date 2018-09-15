package com.demo.dockerspringboot.dockerspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.stereotype.Component;

import java.util.Collections;

@SpringBootApplication
public class DockerspringbootApplication {

	public static void main(String[] args) {

		//SpringApplication.run(DockerspringbootApplication.class, args);
		SpringApplication app = new SpringApplication(DockerspringbootApplication.class);
		app.setDefaultProperties(Collections.singletonMap("server.port", "8083"));
		app.run(args);
	}
}


