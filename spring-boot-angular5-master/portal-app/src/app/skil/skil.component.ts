import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import { Training } from '../models/training.model';
import { SkilService } from './skil.service';
import { Payment } from '../models/payment.model';
import { Skill } from '../models/skill.model';


@Component({
  selector: 'app-skil',
  templateUrl: './skil.component.html',

})
export class SkilComponent implements OnInit {
  trainings: Training[];
  payments: Payment[];
  skills: Skill[];



  constructor(private router: Router, private training1Service: SkilService) {

  }

  ngOnInit() {
    this.training1Service.getTraining()
      .subscribe(data => {
        this.trainings = data;
      });
    this.training1Service.getPayment()
      .subscribe(data => {
        this.payments = data;
      });

  };


  deleteTraining(training1: Training): void {
    this.training1Service.deleteTraining(training1)
      .subscribe(data => {
        this.trainings = this.trainings.filter(u => u !== training1);
      })
  };
  getSkilby(trainingsId) {
    this.training1Service.getSkilby(trainingsId)
      .subscribe(data => {
        this.skills = data;
        console.log(this.skills);
        sessionStorage.setItem('userSkills', JSON.stringify(this.skills))
        this.router.navigateByUrl('skilslip')
      });
  }

}


