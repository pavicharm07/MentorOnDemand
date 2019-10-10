package com.example.demo.skill;

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

import com.example.demo.payment.Payment;



@RestController
@CrossOrigin
//@RequestMapping({"/api"})
@RequestMapping({"/skills"})
public class SkillController {

	@Autowired
	private SkillService skillService;
	
	@PostMapping
	public Skill create(@RequestBody Skill skill) {
		
		
		
/*Training training=trainingService.findById(skill.getId());
		
		if(training!=null)
		{
			training.getSkills().add(skill);
			trainingService.create(training);
		
		}*/
		
		return skillService.create(skill);
	}
	@GetMapping(path = {"/{id"})
	public Skill findOne(@PathVariable("id")int id) {
		return skillService.findById(id);
		
	}
	
	@PutMapping(path= {"/{id}"})
	public Skill update(@PathVariable("id")int id,@RequestBody Skill skill) {
		
		skill.setId(id);
	        return skillService.update(skill);
	    }

	    @DeleteMapping(path ={"/{id}"})
	    public Skill delete(@PathVariable("id") int id) {
	        return skillService.delete(id);
	    }

	    @GetMapping
	    public List<Skill> findAll(){
	        return skillService.findAll();
	    }
	    @GetMapping("/findskillByTrainingId/{trainingId}")
		  public List<Skill> findskillByTrainingId(@PathVariable(value = "trainingId") Integer trainingid){
		    	System.out.println(skillService.findskillByTrainingId(trainingid));
		    	return skillService.findskillByTrainingId(trainingid);}
	 

}
