package com.dxctraining.inventorymgt.phone.dao;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.dxctraining.inventorymgt.phone.entities.Phone;
import com.dxctraining.inventorymgt.phone.exceptions.NotValid;
@Repository
public class PhoneDaoImpl implements PhoneDao {
	@PersistenceContext
	private EntityManager em;
	
	public Phone addPhone(Phone phone) {
		if(phone==null) {
			throw new NotValid("not valid");
		}
		 phone=em.merge(phone);
		 return phone;
		
	}
	public Phone findPhoneById(int id) {
		if(id<1) {
			throw new NotValid("not valid");
		}
		Phone phone=em.find(Phone.class,id);
		return phone;
	}
	public void removePhone(int id) {
		if(id<1) {
			throw new NotValid("not valid");
		}
		Phone phone=findPhoneById(id);
		em.remove(phone);
	}
	
	


}
