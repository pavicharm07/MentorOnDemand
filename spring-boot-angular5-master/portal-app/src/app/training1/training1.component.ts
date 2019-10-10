import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import { Training } from '../models/training.model';
import { Training1Service } from './training1.service';
import { Payment } from '../models/payment.model';

@Component({
  selector: 'app-training1',
  templateUrl: './training1.component.html',
  styleUrls: ['./training1.component.css']
})
export class Training1Component implements OnInit {
  trainings: Training[];
  payments:Payment[];
  userpayments:Payment[];
 
  

  constructor(private router: Router, private training1Service: Training1Service) {

  }

  ngOnInit() {
    this.training1Service.getTraining()
      .subscribe( data => {
        this.trainings=data;
      });
      this.training1Service.getPayment()
      .subscribe( data => {
        this.payments=data;
      });
    
  };
 
  
  deleteTraining(training1: Training): void {
    this.training1Service.deleteTraining(training1)
      .subscribe( data => {
        this.trainings = this.trainings.filter(u => u !== training1);
      })
  };

  getPaymentby(trainingsId) {
    this.training1Service.getPaymentby(trainingsId)
    .subscribe(data => {
      this.payments = data;
      console.log(this.payments);
      sessionStorage.setItem('userPayments', JSON.stringify(this.payments))
      this.router.navigateByUrl('payslip')
    });
  }

}

