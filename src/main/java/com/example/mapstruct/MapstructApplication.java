package com.example.mapstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MapstructApplication {

	public static void main(String[] args) {
		SpringApplication.run(MapstructApplication.class, args);
	}

}
