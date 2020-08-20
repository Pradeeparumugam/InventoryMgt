package com.dxctraining.inventorymgt.phone.dao;

import com.dxctraining.inventorymgt.phone.entities.Phone;

public interface PhoneDao  {
	
		public Phone addPhone(Phone phone);
		public Phone findPhoneById(int id);
		public void removePhone(int id);
		

	}

