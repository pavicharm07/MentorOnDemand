package com.example.demo.user;

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

import com.example.demo.mentor.Mentor;
import com.example.demo.payment.Payment;
import com.example.demo.payment.PaymentService;
import com.example.demo.training.Training;
import com.example.demo.training.TrainingService;
@CrossOrigin(origins="*",maxAge=3600)
@RestController

//@RequestMapping({"/api"})
@RequestMapping({"/users"})
public class UserController {

	@Autowired
	private UserService userService;
	@Autowired
	private TrainingService trainingService;
	@Autowired
	private PaymentService paymentService;
	private int id;
	@PostMapping
	public User create(@RequestBody User user) {
		
		
/*Training training=trainingService.findById(user.getTrainingId());
		
		if(training!=null)
		{
			training.getUsers().add(user);
			trainingService.create(training);
		
		}*/
		
		return userService.create(user);
	}
	
	

	@GetMapping(path = {"/findOneUser/{id}"})
	public User findOne(@PathVariable("id")int id) {
		return userService.findById(id);
		
	}
	
	@PutMapping(path= {"/update/{id}"})
	public User update(@PathVariable("id")int id,@RequestBody User user) {
		
//		 user.setId(id);
	 Training tr=trainingService.findById(user.getTrainingId());
		
		if(tr!=null)
		{
			tr.getUsers().add(user);
			
			trainingService.update(tr);
			
		
		}
		return user;
		
	        
	    }
	@PutMapping(path = {"updates/{id}"})
public User updates(@PathVariable("id") int id, @RequestBody User user){
	return userService.update(user);	
	}
	
	@DeleteMapping(path ={"/{id}"})
    public User delete(@PathVariable("id") int id) {
    	
        return userService.delete(id);
    }
		public Payment create(@RequestBody Payment payment) {
			Training training=trainingService.findById(payment.getTrainingId());
			User ur=userService.findById(payment.getUserId());
					
					if(training!=null)
					{
						training.getPayments().add(payment);
						ur.getPayment().add(payment);
						//trainingService.create(training);
					
					}
					return payment;
					
				}
	     
	  
	    @GetMapping
	    public List<User> findAll(){
	        return userService.findAll();
	    }
	    @GetMapping(path = {"/{userName}/{password}"})
		public User validateuser(@PathVariable("userName")String userName,@PathVariable("password")String password) {
			return userService.validateuser(userName,password);
			
		}
	    @GetMapping(path = {"/active/{active}"})
		public List<User> findByActive(@PathVariable("active") Boolean active)
		{
			return userService.findByActive(active);
		}
	    
	    }

