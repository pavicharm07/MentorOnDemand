import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import { Payment} from '../models/payment.model';
import { Payment1Service } from './payment1.service';

@Component({
  selector: 'app-payment1',
  templateUrl: './payment1.component.html',
  styleUrls: ['./payment1.component.css']
})
export class Payment1Component implements OnInit {

  payments: Payment[];

  constructor(private router: Router, private paymentService: Payment1Service) {

  }

  ngOnInit() {
    this.paymentService.getPayment()
      .subscribe( data => {
        this.payments = data;
      });
  };

 

}
