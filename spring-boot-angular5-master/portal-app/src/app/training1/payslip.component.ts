import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';


import { Training1Service } from './training1.service';
import { SigninService } from '../signin/signin.service';
import { Payment } from '../models/payment.model';

@Component({
  selector: 'app-training',
  templateUrl:'./payslip.component.html',
 
})
export class PayslipComponent implements OnInit {
  userPayments:Payment[]

  constructor(private router: Router, private training1Service: Training1Service,private signinService:SigninService) {

  }

 

  ngOnInit() {
    this.userPayments = JSON.parse(sessionStorage.getItem('userPayments'));
    console.log(this.userPayments);

  };
}
