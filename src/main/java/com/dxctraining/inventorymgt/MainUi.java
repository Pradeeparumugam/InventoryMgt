package com.dxctraining.inventorymgt;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dxctraining.inventorymgt.supplier.entities.*;
import com.dxctraining.inventorymgt.supplier.exception.NotValid;
import com.dxctraining.inventorymgt.item.entities.Item;
import com.dxctraining.inventorymgt.computer.entities.Computer;
import com.dxctraining.inventorymgt.item.service.*;
import com.dxctraining.inventorymgt.supplier.service.*;
import com.dxctraining.inventorymgt.phone.entities.Phone;
import com.dxctraining.inventorymgt.phone.service.*;
import com.dxctraining.inventorymgt.computer.service.ComputerService;

@Component
public class MainUi {

	@Autowired
	private ISupplierService supplierservice;

	@Autowired
	private ItemService itemservice;

	@Autowired
	private ComputerService computerservice;

	@Autowired
	private PhoneService phoneservice;

	@PostConstruct
	public void runUi() {

		try {
			Supplier s1 = new Supplier("name1");
			Supplier s2 = new Supplier("name2");

			s1 = supplierservice.addSupplier(s1);
			s2 = supplierservice.addSupplier(s2);

			// int id1=s1.getId();
			// Supplier supplier=supplierservice.findSupplierById(id1);

			for (int i = 1; i < 3; i++) {
				Supplier supplier = supplierservice.findSupplierById(i);
				System.out.println("Supplier Details =" + supplier.getId() + " " + supplier.getName());
			}

			System.out.println("Supplier completed");

			Item i1 = new Item("Itemname1", s1);
			Item i2 = new Item("Itemname2", s2);

			i1 = itemservice.addItem(i1);
			i2 = itemservice.addItem(i2);

			for (int i = 1; i < 3; i++) {
				Item item = itemservice.findItemById(i);
				System.out.println("Item Details =" +item.getId()+ " " +item.getName() + " " + item.getSupplier());
			}

			System.out.println("Item completed");

			Computer c1 = new Computer("Dell", s1, 8);// 111,"Dell",
			Computer c2 = new Computer("HP", s2, 16);// 222,"HP",

			c1 = computerservice.addComputer(c1);
			c2 = computerservice.addComputer(c2);

			for (int i = 1; i < 3; i++) {
				Computer computer = computerservice.findComputerById(i);
				System.out.println("Computer Details =" + computer.getDisksize() + computer.getSupplier() + " "
						+ computer.getName());

			}

			System.out.println("Computer completed");

			Phone p1 = new Phone("Apple", s1, 128);
			Phone p2 = new Phone("Oneplus", s2, 256);

			p1 = phoneservice.addPhone(p1);
			p2 = phoneservice.addPhone(p2);

			for (int i = 1; i < 3; i++) {
				Phone phone = phoneservice.findPhoneById(i);
				System.out.println(
						"Computer Details =" + phone.getName() + phone.getSupplier() + " " + phone.getStoragesize());
			}
			System.out.println("Phone completed");

		} catch (NotValid e) {
			e.printStackTrace();

		}
	}
}
