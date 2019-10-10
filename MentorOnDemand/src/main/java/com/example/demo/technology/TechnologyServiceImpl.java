package com.example.demo.technology;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TechnologyServiceImpl implements TechnologyService {
	@Autowired
	private TechnologyRepository repository;

	@Override
	public Technology create(Technology technology) {
		// TODO Auto-generated method stub
		return repository.save(technology);
	}

	@Override
	public Technology delete(int id) {
		// TODO Auto-generated method stub
		Technology technology=findById(id);
		if(technology!=null) {
			repository.delete(technology);
		}
		return technology;
		
	}

	@Override
	public Technology findById(int id) {
		// TODO Auto-generated method stub
		return repository.findOne(id);
	}

	@Override
	public Technology update(Technology technology) {
		// TODO Auto-generated method stub
		return repository.save(technology);
	}

	@Override
	public List<Technology> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}
}
	