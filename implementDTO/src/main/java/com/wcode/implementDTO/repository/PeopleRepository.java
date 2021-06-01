package com.wcode.implementDTO.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wcode.implementDTO.model.People;

public interface PeopleRepository extends JpaRepository<People, Long> {

}
