package com.dxctraining.inventorymgt.item.service;

import java.util.List;

import com.dxctraining.inventorymgt.item.entities.Item;

public interface ItemService {
	public Item addItem(Item item);
	public Item findItemById(int id);
	public void removeItem(int id);
	public List<Item> displayItem();

}
