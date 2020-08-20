package com.dxctraining.inventorymgt.computer.dao;

import org.springframework.stereotype.Component;

import com.dxctraining.inventorymgt.computer.entities.Computer;
@Component
public interface ComputerDao  {
	
		public Computer addComputer(Computer computer);
		public Computer findComputerById(int id);
		public void removeComputer(int id);
		

	}

