package com.example.demo.calender;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CalenderServiceImpl implements CalenderService {
	@Autowired
	private CalenderRepository repository;

	@Override
	public Calender create(Calender calender) {
		// TODO Auto-generated method stub
		return repository.save(calender);
	}

	@Override
	public Calender delete(int id) {
		// TODO Auto-generated method stub
		Calender calender=findById(id);
		if(calender!=null) {
			repository.delete(calender);
		}
		return calender;
	}

	@Override
	public List<Calender> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Calender findById(int id) {
		// TODO Auto-generated method stub
		return repository.findOne(id);
	}

	@Override
	public Calender update(Calender calender) {
		// TODO Auto-generated method stub
		return repository.save(calender);
	}

}
