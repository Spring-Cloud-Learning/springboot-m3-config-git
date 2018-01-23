package com.speed.mixer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringbootM3ConfigGitApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootM3ConfigGitApplication.class, args);
	}
}
