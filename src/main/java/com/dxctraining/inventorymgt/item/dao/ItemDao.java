package com.dxctraining.inventorymgt.item.dao;

import com.dxctraining.inventorymgt.item.entities.Item;

public interface ItemDao {
	public Item addItem(Item item);
	public Item findItemById(int id);
	public void removeItem(int id);
	

}
