package com.example.demo.user;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import com.example.demo.mentor.Mentor;

public interface UserRepository extends Repository<User,Integer> {

	void delete(User user);
	List<User>findAll();
	@Query("select user from User user where user.id=?")
	
	User findOne(int id);
	
	@Query("select user from User user where user.userName=? and user.password=?")
	User validateuser(String userName, String password);
	User save(User user);
	List<User> findByActive(Boolean active);
}
