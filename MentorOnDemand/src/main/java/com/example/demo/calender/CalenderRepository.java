package com.example.demo.calender;

import java.util.List;

import org.springframework.data.repository.Repository;

public interface CalenderRepository extends Repository<Calender,Integer> {

	void delete(Calender calender);
	List<Calender>findAll();
	Calender findOne(int id);
	Calender save(Calender calender);
}
