package com.example.demo.calender;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping({"/api"})
@RequestMapping({"/calenders"})
public class CalenderController {

	@Autowired
	private CalenderService calenderService;
	@PostMapping
	public Calender create(@RequestBody Calender calender) {
		return calenderService.create(calender);
	}
	@GetMapping(path = {"/{id"})
	public Calender findOne(@PathVariable("id")int id) {
		return calenderService.findById(id);
		
	}
	
	@PutMapping(path= {"/{id}"})
	public Calender update(@PathVariable("id")int id,@RequestBody Calender calender) {
		
		calender.setid(id);
	        return calenderService.update(calender);
	    }

	    @DeleteMapping(path ={"/{id}"})
	    public Calender delete(@PathVariable("id") int id) {
	        return calenderService.delete(id);
	    }

	    @GetMapping
	    public List<Calender> findAll(){
	        return calenderService.findAll();
	    }

}
