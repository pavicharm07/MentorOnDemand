import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';


import { TrainerprofileService } from './trainerprofile.service';
import { Training } from '../models/training.model';

@Component({
  selector: 'app-trainerprofile',
  templateUrl: './trainerprofile.component.html',
  styles: []
})
export class TrainerprofileComponent implements OnInit {

  trainings: Training[];
 
  constructor(private router: Router, private trainerprofileService: TrainerprofileService) {

  }

  ngOnInit() {
    this.trainerprofileService.getTraining()
      .subscribe( data => {
        this.trainings = data;
      });
  };

  deleteTraining(training: Training): void {
    this.trainerprofileService.deleteTraining(training)
      .subscribe( data => {
        this.trainings = this.trainings.filter(u => u !== training);
      })
  };


}