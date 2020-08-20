package com.dxctraining.inventorymgt.phone.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxctraining.inventorymgt.phone.dao.*;
import com.dxctraining.inventorymgt.phone.entities.Phone;

import com.dxctraining.inventorymgt.phone.exceptions.NotValid;

@Transactional
@Service
public class PhoneServiceImpl implements PhoneService {
	@Autowired
	private PhoneDao phonedaoimpl;

	public Phone addPhone(Phone phone) {
		phone = phonedaoimpl.addPhone(phone);
		return phone;

	}

	public Phone findPhoneById(int id) {
		verify(id);
		Phone phone = phonedaoimpl.findPhoneById(id);
		return phone;
	}

	public void removePhone(int id) {
		verify(id);
		phonedaoimpl.removePhone(id);
	}

	public void verify(int id) {
		if (id < 1) {
			throw new NotValid("not valid");
		}
	}

}
