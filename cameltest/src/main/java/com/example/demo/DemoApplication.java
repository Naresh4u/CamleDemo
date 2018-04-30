package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@SpringBootApplication
@EnableConfigurationProperties
public class DemoApplication {


	public static void main(String[] args) throws URISyntaxException, IOException {
		SpringApplication.run(DemoApplication.class, args);

		Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + "http://localhost:8088/posts/");
		Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + "http://localhost:8088/posts/2");
		Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + "http://localhost:8088/users/2");

	}





}
