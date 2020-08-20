package com.dxctraining.inventorymgt.computer.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxctraining.inventorymgt.computer.dao.*;
import com.dxctraining.inventorymgt.computer.entities.Computer;

import com.dxctraining.inventorymgt.computer.exceptions.NotValid;

@Transactional
@Service
public class ComputerServiceImpl {
	@Autowired
	private ComputerDaoImpl computerdaoimpl;

	public Computer addComputer(Computer computer) {
		computer = computerdaoimpl.addComputer(computer);
		return computer;

	}

	public Computer findComputerById(int id) {
		verify(id);
		Computer computer = computerdaoimpl.findComputerById(id);
		return computer;
	}

	public void removeComputer(int id) {
		verify(id);
		computerdaoimpl.removeComputer(id);
	}

	public void verify(int id) {
		if (id < 1) {
			throw new NotValid("not valid");
		}
	}

}
