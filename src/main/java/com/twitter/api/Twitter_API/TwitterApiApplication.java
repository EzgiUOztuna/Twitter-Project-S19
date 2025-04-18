package com.twitter.api.Twitter_API;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*
@EntityScan(basePackages = {"com.twitter.api.Twitter_API"})
@EnableJpaRepositories(basePackages = {"com.twitter.api.Twitter_API"})
@ComponentScan(basePackages = {"com.twitter.api.Twitter_API"})
*/
@SpringBootApplication
public class TwitterApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TwitterApiApplication.class, args);
	}

}
