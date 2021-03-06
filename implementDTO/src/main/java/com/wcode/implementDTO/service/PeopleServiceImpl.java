package com.wcode.implementDTO.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wcode.implementDTO.model.People;
import com.wcode.implementDTO.repository.PeopleRepository;

@Service
public class PeopleServiceImpl implements PeopleService {

	@Autowired
	private PeopleRepository peopleRepository;

	@Override
	public People create(People people) {
		return this.peopleRepository.save(people);
	}

	@Override
	public List<People> findAll() {
		return this.peopleRepository.findAll();
	}

	@Override
	public People findOne(Long id) {
		return this.peopleRepository.getById(id);
	}

	@Override
	public People update(Long id, People people) {
		return this.findOne(id) != null ? this.peopleRepository.save(people) : null;
	}

	@Override
	public void delete(Long id) {
		this.peopleRepository.deleteById(id);
	}

}
