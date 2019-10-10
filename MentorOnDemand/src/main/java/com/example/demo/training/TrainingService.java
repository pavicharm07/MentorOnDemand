package com.example.demo.training;


import java.util.Date;
import java.util.List;

public interface TrainingService {
	List<Training> findTrainingByMentorId(Integer mentorId);
	List<Training> findTrainingByUsersId(Integer usersId);
	Training findByIdAndMentorId(Integer id,Integer mentorId);
	Training findByIdAndUsersId(Integer trainingId,Integer usersId);
  Training create(Training training);
  Training delete(int id);
  List<Training> findAll();
  Training findById(int id);
  Training update(Training training);

List<Training> findBystartDateBetween(Date startDate,Date endDate);


}
