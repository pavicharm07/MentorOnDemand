package com.example.demo.training;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
//@RequestMapping({"/api"})
@RequestMapping({"/trainings"})
public class TrainingController {

	@Autowired
	private TrainingServiceImpl trainingService;
	@PostMapping
	public Training create(@RequestBody Training training) {
		return trainingService.create(training);
	}
	@GetMapping(path = {"/{id}"})
	public Training findOne(@PathVariable("id")int id) {
		return trainingService.findById(id);
		
	}
	
	@PutMapping(path= {"/{id}"})
	public Training update(@PathVariable("id")int id,@RequestBody Training training) {
		
		 training.setId(id);
	        return trainingService.update(training);
	    }

	    @DeleteMapping(path ={"/{id}"})
	    public Training delete(@PathVariable("id") int id) {
	        return trainingService.delete(id);
	    }

	    @GetMapping
	    public List<Training> findAll(){
	        return trainingService.findAll();
	    }
	    
	    @GetMapping("/findTrainingByMentorId/{mentorId}")
	    public List < Training > getTrainingByMentor(@PathVariable(value = "mentorId") Integer mentorId) {
	        return trainingService.findTrainingByMentorId(mentorId);
	       
	    }
	    @GetMapping("/findByIdAndUsersId/{trainingId}/{userId}")
	    public Training findByIdAndUsersId(@PathVariable(value = "trainingId") Integer trainingId,@PathVariable(value = "userId")Integer usersId) {
	    	
	        return trainingService.findByIdAndUsersId(trainingId,usersId);
	    }
	   
	    @GetMapping("/findTrainingByUsersId/{userId}")
	    public List<Training> getTrainingByUsers(@PathVariable(value = "userId") Integer usersId) {
	        return trainingService.findTrainingByUsersId(usersId);
	       
	    }
	    
	    @GetMapping("/findByIdandmentorId/{trainingId}/{mentorId}")
	    public Training findByIdandmentorId(@PathVariable(value = "trainingId") Integer trainingId,@PathVariable(value = "mentorId")Integer mentorId) {
	    	System.out.println(trainingService.findByIdAndMentorId(trainingId, mentorId));
	        return trainingService.findByIdAndMentorId(trainingId,mentorId);
	    }
	    //@DateTimeFormat(pattern="YYYY-MM-dd")Date toDate
	    @GetMapping(path= {"/findBystartDateBetween/{startDate}/{endDate}"})
	    public List<Training> findBystartDateBetween(@PathVariable(value = "startDate")  @DateTimeFormat(pattern="yyyy-MM-dd") Date startDate, @PathVariable(value = "endDate") @DateTimeFormat(pattern="yyyy-MM-dd") Date endDate) {
			System.out.println(trainingService.findBystartDateBetween(startDate, endDate));
			return trainingService.findBystartDateBetween(startDate, endDate);
		}
	    	/*SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
	    	Date startDate1;
			try {
				startDate1 = simpleDateFormat.parse(startDate);
			} catch (ParseException e) {
				startDate1=new Date();
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	Date endDate1;
			try {
				endDate1 = simpleDateFormat.parse(endDate);
			} catch (ParseException e) {
				endDate1=new Date();
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
	    	
	    	
	    }
	    
	    
