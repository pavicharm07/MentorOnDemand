import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import { Training } from '../models/training.model';
import { SkilService } from './skil.service';
import { Payment } from '../models/payment.model';
import { Skill } from '../models/skill.model';


@Component({
  selector: 'app-skil',
  templateUrl: './skilslip.component.html',
 
})
export class SkilslipComponent implements OnInit {
  trainings: Training = new Training();
  skills:Skill[];
  userSkills:Skill[];
 
  

  constructor(private router: Router, private training1Service: SkilService) {

  }

  ngOnInit() {
  
      this.userSkills = JSON.parse(sessionStorage.getItem('userSkills'));
      console.log(this.userSkills);
  
    };}