package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;
@EnableTurbine //聚合
@EnableHystrixDashboard 
@SpringBootApplication
public class SpringbootNacosServiceProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootNacosServiceProviderApplication.class, args);
	}
}
