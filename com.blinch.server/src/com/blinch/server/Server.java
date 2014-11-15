package com.blinch.server;

import com.blunch.backend.ComponentScan;
import com.blunch.backend.Configuration;
import com.blunch.backend.EnableAutoConfiguration;

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class Server {

	public static void main(String... args) {
		System.out.println("Hello Blinch");

		SpringApplication.run(Server.class, args);
	}

	public static class ApiWebSecurityConfigurerAdapter extends
			WebSecurityConfigurerAdapter {

	}

}
