package com.dxctraining.inventorymgt.computer.ui;

import javax.annotation.PostConstruct;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dxctraining.inventorymgt.computer.service.*;
import com.dxctraining.inventorymgt.computer.entities.*;
import com.dxctraining.inventorymgt.computer.exceptions.NotValid;


@Component
public class ComputerUi {

	@Autowired
	private ComputerService service;

	@PostConstruct
	public void runUi() {
		
		try {
		
		Computer c1 = new Computer("deep",8);//111,"Dell",
		Computer c2=new Computer("pra",16);//222,"HP",
		

		c1 = service.addComputer(c1);
		c2 = service.addComputer(c2);
		
		

		for (int i = 1; i < 3; i++) {
			Computer computer = service.findComputerById(i);
			System.out.println("Computer Details ="+computer.getDisksize()/* + computer.getId()+ " " + computer.getName()*/); 
		}
		}
		catch (NotValid e) { 
			         e.printStackTrace(); 

	}
	}
}
