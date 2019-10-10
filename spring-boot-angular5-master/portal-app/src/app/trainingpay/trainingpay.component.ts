import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import { Training } from '../models/training.model';
import { TrainingpayService } from './trainingpay.service';


@Component({
  selector: 'app-trainingpay',
  templateUrl: './trainingpay.component.html',
 
})
export class TrainingpayComponent implements OnInit {
  trainings: Training[];
 
  

  constructor(private router: Router, private trainingpayService: TrainingpayService) {

  }

  ngOnInit() {
    this.trainingpayService.getTraining()
      .subscribe( data => {
        this.trainings=data;
      });
     
     
  };
 
  
  deleteTraining(training1: Training): void {
    this.trainingpayService.deleteTraining(training1)
      .subscribe( data => {
        this.trainings = this.trainings.filter(u => u !== training1);
      })
  };


}
