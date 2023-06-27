package com.tpe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableConfigServer // !!! Config sunucusu oldugunu anote ettik
@EnableEurekaClient // !!! Eureka Serverin Client'i oldugunu soyledik
@SpringBootApplication
public class ConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigApplication.class, args);
	}

}
