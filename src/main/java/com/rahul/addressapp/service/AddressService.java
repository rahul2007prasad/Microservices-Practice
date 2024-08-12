package com.rahul.addressapp.service;

import org.springframework.stereotype.Service;

import com.rahul.addressapp.entity.Address;

@Service
public class AddressService {

	Address address = new Address();
	
	public Address getAddress(Integer id) {
		
		address.setId(1);
		address.setLandmark("abhay Khand");
		address.setLane("Indirapuram");
		return address;
	}
}
