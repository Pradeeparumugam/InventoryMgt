package com.dxctraining.inventorymgt.computer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.dxctraining.inventorymgt.computer"})
public class ProjectMain {

	public static void main(String[] args) {
		SpringApplication.run(ProjectMain.class, args);
	}

}
