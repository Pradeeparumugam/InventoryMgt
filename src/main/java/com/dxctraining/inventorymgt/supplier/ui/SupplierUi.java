package com.dxctraining.inventorymgt.supplier.ui;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import com.dxctraining.inventorymgt.supplier.entities.*;
import com.dxctraining.inventorymgt.supplier.exception.NotValid;
import com.dxctraining.inventorymgt.supplier.service.ISupplierService;

@Component
public class SupplierUi {

	@Autowired
	private ISupplierService service;

	@PostConstruct
	public void runUi() {
		
		try {
		Supplier s1 = new Supplier("name1");
		Supplier s2 = new Supplier("name2");

		s1 = service.addSupplier(s1);
		s2 = service.addSupplier(s2);
		
		//int id1=s1.getId(); 
	        // Supplier supplier=service.findSupplierById(id1); 

		for (int i = 1; i < 3; i++) {
			Supplier supplier = service.findSupplierById(i);
			System.out.println("Supplier Details =" + supplier.getId() + " " + supplier.getName());
		}
		}
		catch (NotValid e) { 
			         e.printStackTrace(); 

	}
	}
}
