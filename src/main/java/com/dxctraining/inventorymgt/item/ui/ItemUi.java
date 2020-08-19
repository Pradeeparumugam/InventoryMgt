package com.dxctraining.inventorymgt.item.ui;

import javax.annotation.PostConstruct;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dxctraining.inventorymgt.item.service.ItemService;
import com.dxctraining.inventorymgt.item.entities.*;
import com.dxctraining.inventorymgt.item.exception.NotValid;


@Component
public class ItemUi {

	@Autowired
	private ItemService service;

	@PostConstruct
	public void runUi() {
		
		try {
		Item i1 = new Item(11,"Itemname1");
		Item i2 = new Item(22,"Itemname2");

		i1 = service.addItem(i1);
		i2 = service.addItem(i2);
		
		//int id1=s1.getId(); 
	         //Supplier supplier=service.findSupplierById(id1); 

		for (int i = 1; i < 3; i++) {
			Item item = service.findItemById(i);
			System.out.println("Item Details =" + item.getId() + " " + item.getName());
		}
		}
		catch (NotValid e) { 
			         e.printStackTrace(); 

	}
	}
}
