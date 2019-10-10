package com.example.demo.payment;

import java.util.List;



public interface PaymentService {
  Payment create( Payment payment);
  Payment delete(int id);
  List< Payment> findAll();
  Payment findById(int id);
  Payment update( Payment payment);
List<Payment> findPaymentBymentor(Integer mentorId);
List<Payment> findPaymentByUsersId(Integer usersId);
List<Payment> findPaymentByTrainingIdandUsersId(Integer trainingid, Integer usersId);
}
