package com.rahul.addressapp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor

@AllArgsConstructor
@Getter
@Setter
public class Address {

	private Integer id;
	private String lane;
	private String landmark;
	
}
