import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import { Training } from '../models/training.model';
import { Training1Service } from './training1.service';
import { SigninService } from '../signin/signin.service';

@Component({
  selector: 'app-training',
  templateUrl: './trainingsearch.component.html',
 
})
export class TrainingsearchComponent implements OnInit {
  trainings: Training[];
 

  constructor(private router: Router, private training1Service: Training1Service,private signinService:SigninService) {

  }

 

  ngOnInit() {
    this.training1Service.getTrainingstartendDate()
      .subscribe( data => {
        this.trainings = data;
      });
  };

  deleteTraining(training: Training): void {
    this.training1Service.deleteTraining(training)
      .subscribe( data => {
        this.trainings = this.trainings.filter(u => u !== training);
      })
  };
  settraining(training): void {
    var loggedInUser = JSON.parse(sessionStorage.getItem('loggedinuser'));
    if (loggedInUser == null) {
      alert("please log In")
      this.router.navigateByUrl('/signin')

    }
    else {
      loggedInUser.trainingId=training.id;
      this.signinService.enrollUser(loggedInUser)
        .subscribe(data => {
          console.log(data);
          

        })
        alert("You are Enrolled for the course!")
    }
  };


}




