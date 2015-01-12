package blinch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


@Configuration
@ComponentScan
@EnableAutoConfiguration
public class Server {

	public static void main(String... args) {

		SpringApplication.run(Server.class, args);
	}


//	public static class ApiWebSecurityConfigurerAdapter extends
//			WebSecurityConfigurerAdapter {
//
//	}


}
