package com.example.demo.payment;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

public interface PaymentRepository extends Repository<Payment,Integer> {

	void delete(Payment payment);
	List<Payment>findAll();
	Payment findOne(int id);
	Payment save(Payment payment);
	
	@Query("select payment from Payment payment where payment.mentorId=?")
	List<Payment> findPaymentBymentor(Integer mentorId);
	@Query("select payment from Payment payment where payment.userId=?")
	List<Payment> findPaymentByUsersId(Integer usersId);
    @Query("select payment from Payment payment where payment.trainingId=? and payment.userId=?")
	List<Payment> findPaymentByTrainingIdandUsersId(Integer trainingid, Integer usersId);
}
