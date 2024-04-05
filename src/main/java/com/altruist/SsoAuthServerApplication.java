package com.altruist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class SsoAuthServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SsoAuthServerApplication.class, args);
	}

	
	
}
