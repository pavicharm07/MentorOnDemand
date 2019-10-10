package com.example.demo.mentor;

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

import com.example.demo.user.User;

@RestController
@CrossOrigin
//@RequestMapping({"/api"})
@RequestMapping({"/mentors"})
public class MentorController {

	@Autowired
	private MentorService mentorService;
	@PostMapping
	public Mentor create(@RequestBody Mentor mentor) {
		return mentorService.create(mentor);
	}
	@GetMapping(path = {"/findOneMentor/{mentorid}"})
	public Mentor findOne(@PathVariable("mentorid")int mentorid) {
		return mentorService.findById(mentorid);
		
	}
	
	@PutMapping(path= {"/update/{mentorid}"})
	public Mentor update(@PathVariable("mentorid")int mentorid,@RequestBody Mentor mentor) {
		
		//mentor.setId(mentorid);
	        return mentorService.update(mentor);
	    }


	    @DeleteMapping(path ={"/{mentorid}"})
	    public Mentor delete(@PathVariable("mentorid") int mentorid) {
	        return mentorService.delete(mentorid);
	    }

	    @GetMapping
	    public List<Mentor> findAll(){
	        return mentorService.findAll();
	    }
	    @GetMapping(path = {"/{userName}/{password}"})
		public Mentor validatementor(@PathVariable("userName")String userName,@PathVariable("password")String password) {
			return mentorService.validatementor(userName,password);
			
		}
	    @GetMapping(path = {"/active/{active}"})
	  		public List<Mentor> findByActive(@PathVariable("active") Boolean active)
	  		{
	  			return mentorService.findByActive(active);
	  		}

}
