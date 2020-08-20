package com.dxctraining.inventorymgt.phone.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.dxctraining.inventorymgt.item.entities.Item;
import com.dxctraining.inventorymgt.supplier.entities.Supplier;

@Entity

public class Phone extends Item{
	private int storagesize;
	//private int id;
	//private String name;
	
	public Phone(String name,Supplier supplier,int storagesize) {
	
		super(name,supplier);
		this.storagesize=storagesize;
		
	}
	public Phone() {
		
	}
	public int getStoragesize() {
		return storagesize;
	}

	public void setStoragesize(int storagesize) {
		this.storagesize = storagesize;
	}
	

}
