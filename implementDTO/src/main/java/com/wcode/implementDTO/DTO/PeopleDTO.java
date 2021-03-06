package com.wcode.implementDTO.DTO;

import java.io.Serializable;

import com.wcode.implementDTO.model.People;

public class PeopleDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String name;
	private String address;

	public PeopleDTO(People people) {
		this.name = people.getName() + " " + people.getLastName();
		this.address = "Rua " + people.getAddress().getStreet() + " , " 
				+ people.getAddress().getDistrict() + ", " 
				+ people.getAddress().getNumber() + " , "
				+ people.getAddress().getCity() + " - " + people.getAddress().getState() + " - "
				+ people.getAddress().getCEP();

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
