package com.dxctraining.inventorymgt.computer.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.dxctraining.inventorymgt.computer.entities.Computer;
import com.dxctraining.inventorymgt.computer.exceptions.NotValid;

@Repository
public class ComputerDaoImpl implements ComputerDao {
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Computer addComputer(Computer computer) {
		if (computer == null) {
			throw new NotValid("not valid");
		}
		computer = em.merge(computer);
		return computer;

	}
	
	@Override
	public Computer findComputerById(int id) {
		if (id < 1) {
			throw new NotValid("not valid");
		}
		Computer computer = em.find(Computer.class, id);
		return computer;
	}

	@Override
	public void removeComputer(int id) {
		if (id < 1) {
			throw new NotValid("not valid");
		}
		Computer computer = findComputerById(id);
		em.remove(computer);
	}

}
