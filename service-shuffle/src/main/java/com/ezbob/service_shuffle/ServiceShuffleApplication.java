package com.ezbob.service_shuffle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class ServiceShuffleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceShuffleApplication.class, args);
	}

}
