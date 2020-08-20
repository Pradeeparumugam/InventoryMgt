package com.dxctraining.inventorymgt.computer.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.dxctraining.inventorymgt.item.entities.Item;

@Entity
@Table(name = "inventorymgt")
public class Computer extends Item{
	private int disksize;
	//private int id;
	//private String name;
	
	public Computer(String name,int disksize) {
	
		super(name);
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
