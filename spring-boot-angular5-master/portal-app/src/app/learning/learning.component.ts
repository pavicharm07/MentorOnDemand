import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import { User } from '../models/user.model';
import { LearningService } from './learning.service';

@Component({
  selector: 'app-learning',
  templateUrl: './learning.component.html',
  styles: []
})
export class LearningComponent implements OnInit {
  id=sessionStorage.getItem('id')
  users: User[];

  constructor(private router: Router, private learningService: LearningService) {

  }

  ngOnInit() {
    this.learningService.getUsers()
      .subscribe( data => {
        this.users = data;
      });
  };

  deleteUser(user: User): void {
    this.learningService.deleteUser(user)
      .subscribe( data => {
        this.users = this.users.filter(u => u !== user);
      })
  };
  logout(user:User)
	{
		
   
      sessionStorage.removeItem('id')
    
	
		this.router.navigate(['signin']);
	}
	
  findtraining(startDate,endDate):void{
    this.learningService.findtraining(startDate,endDate).subscribe(data =>{
      if(data==null){
        alert("Invalid  search results!");
      }
      else {
        sessionStorage.setItem('startDate',startDate);
        sessionStorage.setItem('endDate',endDate);
  this.router.navigate(['trainingsearch']);
      
     
  }

})

  };
}




