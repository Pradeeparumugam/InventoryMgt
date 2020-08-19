package com.dxctraining.inventorymgt.supplier.dao;
import java.util.List;


import com.dxctraining.inventorymgt.supplier.entities.*;


public interface ISupplierDao {
	public Supplier addSupplier(Supplier supplier);
	public Supplier findSupplierById(int id);
	public void removeSupplier(int id);
	public List<Supplier> displaySuppliers();

}
