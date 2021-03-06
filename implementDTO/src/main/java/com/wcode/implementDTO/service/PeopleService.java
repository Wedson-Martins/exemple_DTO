package com.wcode.implementDTO.service;

import java.util.List;

import com.wcode.implementDTO.model.People;

public interface PeopleService {

	public People create(People people);

	public List<People> findAll();

	public People findOne(Long id);

	public People update(Long id, People people);

	public void delete(Long id);

}
