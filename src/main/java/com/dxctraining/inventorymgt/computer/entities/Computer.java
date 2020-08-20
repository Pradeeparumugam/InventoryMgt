package com.dxctraining.inventorymgt.computer.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.dxctraining.inventorymgt.item.entities.Item;
import com.dxctraining.inventorymgt.supplier.entities.Supplier;

@Entity
public class Computer extends Item{
	private int disksize;
	//private int id;
	//private String name;
	
	public Computer(String name,Supplier supplier,int disksize) {
	
		super(name,supplier);
		this.disksize=disksize;
		
	}
	public Computer() {
		
	}
	public int getDisksize() {
		return disksize;
	}

	public void setDisksize(int disksize) {
		this.disksize = disksize;
	}
	

}
