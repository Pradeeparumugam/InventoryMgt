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
	private ComputerDao computerdao;

	public Computer addComputer(Computer computer) {
		computer = computerdao.addComputer(computer);
		return computer;

	}

	public Computer findComputerById(int id) {
		verify(id);
		Computer computer = computerdao.findComputerById(id);
		return computer;
	}

	public void removeComputer(int id) {
		verify(id);
		computerdao.removeComputer(id);
	}

	public void verify(int id) {
		if (id < 1) {
			throw new NotValid("not valid");
		}
	}

}
