package com.example.demo.payment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.training.Training;
import com.example.demo.training.TrainingService;
import com.example.demo.user.User;
import com.example.demo.user.UserService;

@RestController
@CrossOrigin
//@RequestMapping({"/api"})
@RequestMapping({"/payments"})
public class PaymentController {

	@Autowired
	private PaymentService paymentService;
	@Autowired
	private TrainingService trainingService;
	@Autowired
	private UserService userservice; 
	
	
	
	@PostMapping
	public Payment create(@RequestBody Payment payment) {
Training training=trainingService.findById(payment.getTrainingId());
User ur=userservice.findById(payment.getUserId());
		
		if(training!=null)
		{
			training.getPayments().add(payment);
			ur.getPayment().add(payment);
			paymentService.create(payment);
		
		}
		return payment;
		
	}
	@GetMapping(path = {"/{id"})
	public Payment findOne(@PathVariable("id")int id) {
		return paymentService.findById(id);
		
	}
	 @GetMapping("/findPaymentBymentor/{mentorId}")
	    public List < Payment > getPaymentBymentor(@PathVariable(value ="mentorId") Integer mentorId) {
	        return paymentService.findPaymentBymentor(mentorId);
	       
	    }
	    @GetMapping("/findPaymentByUsersId/{userId}")
	    public List<Payment> findPaymentByUsersId(@PathVariable(value = "userId") Integer usersId) {
	        return paymentService.findPaymentByUsersId(usersId);
	       
	    }
	    @GetMapping("/findPaymentByTrainingIdandUsersId/{trainingId}/{userId}")
		  public List<Payment> findPaymentByTrainingIdandUsersId(@PathVariable(value = "trainingId") Integer trainingid,@PathVariable(value = "userId")Integer usersId){
		    	System.out.println(paymentService.findPaymentByTrainingIdandUsersId(trainingid, usersId));
		    	return paymentService.findPaymentByTrainingIdandUsersId(trainingid,usersId);}
	 
	@PutMapping(path= {"/{id}"})
	public Payment update(@PathVariable("id")int id,@RequestBody Payment payment) {
		
		payment.setId(id);
	        return paymentService.update(payment);
	    }

	    @DeleteMapping(path ={"/{id}"})
	    public Payment delete(@PathVariable("id") int id) {
	        return paymentService.delete(id);
	    }

	    @GetMapping
	    public List<Payment> findAll(){
	        return paymentService.findAll();
	    }

}
