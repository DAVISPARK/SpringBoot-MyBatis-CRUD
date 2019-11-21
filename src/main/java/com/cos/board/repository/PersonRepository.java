package com.cos.board.repository;

import java.util.List;

import com.cos.board.model.Person;

public interface PersonRepository {
	Person findById(int id);
	List<Person> findAll();
	void save(Person person);
	void delete(int id);
	void update(Person person);
}
