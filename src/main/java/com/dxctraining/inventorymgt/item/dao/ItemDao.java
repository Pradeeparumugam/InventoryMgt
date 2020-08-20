package com.dxctraining.inventorymgt.item.dao;

import java.util.List;

import com.dxctraining.inventorymgt.item.entities.Item;

public interface ItemDao {
	public Item addItem(Item item);
	public Item findItemById(int id);
	public void removeItem(int id);
	public List<Item> displayItem();

}
