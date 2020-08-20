package com.dxctraining.inventorymgt.computer.service;


import com.dxctraining.inventorymgt.computer.entities.Computer;

public interface ComputerService {
	public Computer addComputer(Computer computer);
	public Computer findComputerById(int id);
	public void removeComputer(int id);

}
