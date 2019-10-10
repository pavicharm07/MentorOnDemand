package com.example.demo.training;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

public interface TrainingRepository extends Repository<Training, Integer>{
	
	
	void delete(Training training);
	List<Training> findAll();
	Training findOne(int id);
	Training save(Training t);
	@Query("select training from Training training where training.mentor.mentorid=?")
	List<Training> findTrainingByMentorId(Integer mentorId);
	
	List<Training> findTrainingByUsersId(Integer usersId);
	
	@Query("select training from Training training where training.id=? and training.mentor.mentorid=?")
	Training findByIdAndMentorId(Integer id,Integer mentorId);
	Training findByIdAndUsersId(Integer trainingId, Integer usersId);
	
	List<Training> findBystartDateBetween(Date startDate,Date endDate);

	
	
	
	
}
