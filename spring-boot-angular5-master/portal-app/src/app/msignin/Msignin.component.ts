import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import { Mentor } from '../models/mentor.model';
import { MsigninService } from './msignin.service';

@Component({
  selector: 'app-receipt',
  templateUrl: './msignin.component.html',
  styles: []
})
export class MsigninComponent implements OnInit {

  mentors: Mentor[];
  Mentor:Mentor=new Mentor();
 

  constructor(private router: Router, private msigninService: MsigninService) {

  }

  ngOnInit() {
    this.msigninService.getMentors()
      .subscribe( data => {
        this.mentors = data;
      });
  };

  deleteUser(mentor: Mentor): void {
    this.msigninService.deleteMentor(mentor)
      .subscribe( data => {
        this.mentors = this.mentors.filter(u => u !== mentor);
      })
  };
  validate(userName, password): void{
    this.msigninService.validate(userName,password).subscribe(data =>{
      if(data==null){
        alert("Invalid Username or Password!");
      }
      else if(!data.active){
        alert("mentor is blocked!!");
      }
      else{
          sessionStorage.setItem('mentorid',data.id);
         this.router.navigate(['mentor1']);
      }
    })
  };

}


