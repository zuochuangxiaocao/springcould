package com.didispace;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.didispace.filter.AccessFilter;

@SpringBootApplication
@EnableZuulProxy
public class EurekaClientZuulApplication {

	public static void main(String[] args) {

		SpringApplication.run(EurekaClientZuulApplication.class, args);

	}
	
	@Bean
	public AccessFilter accessFilter() {
		return new AccessFilter();
	}

}
