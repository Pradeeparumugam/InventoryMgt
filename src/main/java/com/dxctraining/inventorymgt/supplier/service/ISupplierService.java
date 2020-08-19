package com.dxctraining.inventorymgt.supplier.service;

import java.util.List;

import com.dxctraining.inventorymgt.supplier.entities.Supplier;

public interface ISupplierService {
	public Supplier addSupplier(Supplier supplier);
	public Supplier findSupplierById(int id);
	public void removeSupplier(int id);
	public List<Supplier> displaySuppliers();

}
