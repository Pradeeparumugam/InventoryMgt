package com.dxctraining.inventorymgt.item.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxctraining.inventorymgt.item.dao.*;
import com.dxctraining.inventorymgt.item.entities.Item;
import com.dxctraining.inventorymgt.item.exception.NotValid;

@Transactional
@Service
public class ItemServiceImpl implements ItemService {
	@Autowired
	private ItemDaoImpl itemdaoimpl;

	public Item addItem(Item item) {
		item = itemdaoimpl.addItem(item);
		return item;

	}

	public Item findItemById(int id) {
		verify(id);
		Item item = itemdaoimpl.findItemById(id);
		return item;
	}

	public void removeItem(int id) {
		verify(id);
		itemdaoimpl.removeItem(id);
	}
	public List<Item> displayItem() { 
	        List<Item> items=itemdaoimpl.displayItem(); 
	        return items; 
	}

	public void verify(int id) {
		if (id < 1) {
			throw new NotValid("not valid");
		}
	}

}
