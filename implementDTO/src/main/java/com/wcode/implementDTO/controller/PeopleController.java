package com.wcode.implementDTO.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wcode.implementDTO.DTO.PeopleDTO;
import com.wcode.implementDTO.model.People;
import com.wcode.implementDTO.service.PeopleService;

@RestController
@RequestMapping
public class PeopleController {

	@Autowired
	private PeopleService peopleService;

	@GetMapping
	private ResponseEntity<?> findAll() {
		List<People> peoples = this.peopleService.findAll();
		if (peoples.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		} else {
//			return new ResponseEntity<List<People>>(peoples, HttpStatus.OK);
			return new ResponseEntity<List<PeopleDTO>>(toConvertDTO(peoples), HttpStatus.OK);
		}

	}

	private List<PeopleDTO> toConvertDTO(List<People> peoples) {
		List<PeopleDTO> peopleDTOs = new ArrayList<>();
		peoples.forEach(p -> {
			PeopleDTO peopleDTO = new PeopleDTO(p);
			peopleDTOs.add(peopleDTO);
		});
//		peopleDTOs.forEach(p -> {
//			System.out.println("Name: " + p.getName());
//		});
		
		return peopleDTOs;

	}

}
