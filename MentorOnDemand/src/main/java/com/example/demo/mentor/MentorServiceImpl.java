package com.example.demo.mentor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.user.User;
import com.example.demo.user.UserRepository;


@Service
public class MentorServiceImpl implements MentorService {
	@Autowired
	private MentorRepository repository;

	@Override
	public Mentor create(Mentor mentor) {
		// TODO Auto-generated method stub
		return repository.save(mentor);
	}

	@Override
	public Mentor delete(int id) {
		// TODO Auto-generated method stub
		Mentor mentor=findById(id);
		if(mentor!=null) {
			repository.delete(mentor);
		}
		return mentor;
		
	}

	@Override
	public Mentor findById(int id) {
		// TODO Auto-generated method stub
		return repository.findOne(id);
	}

	@Override
	public Mentor update(Mentor mentor) {
		// TODO Auto-generated method stub
		return repository.save(mentor);
	}

	@Override
	public List<Mentor> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Mentor validatementor(String userName, String password) {
		// TODO Auto-generated method stub
		return repository.validatementor(userName,password);
	}

	@Override
	public List<Mentor> findByActive(Boolean active) {
		// TODO Auto-generated method stub
		return repository.findByActive(active);
	}
}
	