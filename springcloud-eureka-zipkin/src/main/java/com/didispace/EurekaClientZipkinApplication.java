package com.didispace;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import zipkin.server.EnableZipkinServer;


@SpringBootApplication
@EnableZipkinServer
public class EurekaClientZipkinApplication {

	public static void main(String[] args) {

		SpringApplication.run(EurekaClientZipkinApplication.class, args);

	}

}
