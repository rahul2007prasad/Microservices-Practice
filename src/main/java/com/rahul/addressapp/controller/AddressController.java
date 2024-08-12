package com.rahul.addressapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rahul.addressapp.entity.Address;
import com.rahul.addressapp.service.AddressService;

@RestController
@RequestMapping("/address-api")
public class AddressController {

	@Autowired
	AddressService addressService ;
	
	@GetMapping("/address/{id}")
	public ResponseEntity<Address> getAddress(@PathVariable("id")  Integer id){
		Address address = addressService.getAddress(id);
		System.out.println("Address controller called by employee controller");
		return  ResponseEntity.status(HttpStatus.OK).body(address);
	}
	@GetMapping("/welcome/{id}")
	public ResponseEntity<String> getWelcome(@PathVariable("id")  Integer id){
		
		return  ResponseEntity.status(HttpStatus.OK).body("Welcome");
	}
	
}
