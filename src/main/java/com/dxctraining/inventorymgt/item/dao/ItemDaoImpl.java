package com.dxctraining.inventorymgt.item.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.dxctraining.inventorymgt.item.entities.*;
import com.dxctraining.inventorymgt.item.exception.NotValid;

@Repository
public class ItemDaoImpl implements ItemDao {
	@PersistenceContext
	private EntityManager em;
	
	public Item addItem(Item item) {
		if(item==null) {
			throw new NotValid("not valid");
		}
		 item=em.merge(item);
		 return item;
		
	}
	public Item findItemById(int id) {
		if(id<1) {
			throw new NotValid("not valid");
		}
		Item item=em.find(Item.class,id);
		return item;
	}
	public void removeItem(int id) {
		if(id<1) {
			throw new NotValid("not valid");
		}
		Item item=findItemById(id);
		em.remove(item);
	}
	
	

}
