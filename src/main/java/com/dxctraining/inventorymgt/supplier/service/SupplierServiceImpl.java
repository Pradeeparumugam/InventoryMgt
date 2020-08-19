package com.dxctraining.inventorymgt.supplier.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dxctraining.inventorymgt.supplier.dao.*;
import com.dxctraining.inventorymgt.supplier.entities.*;

import java.util.*;

@Transactional
@Service
public  class SupplierServiceImpl implements ISupplierService {

	@Autowired
	private ISupplierDao dao;

	
	public Supplier findSupplierById(int id) {
		Supplier supplier = dao.findSupplierById(id);
		return supplier;
	}


	public Supplier addSupplier(Supplier supplier) {
		supplier=dao.addSupplier(supplier);
		return supplier;

	}


	public void removeSupplier(int id) {
		dao.removeSupplier(id);
	}

	public List<Supplier> displaySuppliers() { 
 		        List<Supplier>suppliers=dao.displaySuppliers(); 
 		        return suppliers; 
 		}


	
}
