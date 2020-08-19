package com.dxctraining.inventorymgt.supplier.dao;

import javax.persistence.EntityManager;

import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.dxctraining.inventorymgt.supplier.entities.Supplier;
import com.dxctraining.inventorymgt.supplier.exception.NotValid;


import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class SupplierDaoImpl implements ISupplierDao {

	@PersistenceContext
	private EntityManager em;

	public Supplier addSupplier(Supplier supplier) {
		if (supplier == null) {
			throw new NotValid("not valid");
		}
		supplier = em.merge(supplier);
		return supplier;

	}

	public Supplier findSupplierById(int id) {
		if (id < 1) {
			throw new NotValid("not valid");
		}
		Supplier supplier = em.find(Supplier.class, id);
		return supplier;
	}

	public void removeSupplier(int id) {
		if (id < 1) {
			throw new NotValid("not valid");
		}
		Supplier supplier = findSupplierById(id);
		em.remove(supplier);
	}

	public List<Supplier> displaySuppliers() {
		String jpaql = "from supplier";
		TypedQuery<Supplier> query = em.createQuery(jpaql, Supplier.class);
		List<Supplier> suplierlist = query.getResultList();
		return suplierlist;
	}

}
