package com.dxctraining.inventorymgt.computer.dao;

import com.dxctraining.inventorymgt.computer.entities.Computer;

public interface ComputerDao  {
	
		public Computer addComputer(Computer computer);
		public Computer findComputerById(int id);
		public void removeComputer(int id);
		

	}

