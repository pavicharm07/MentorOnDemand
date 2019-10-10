import { Component } from '@angular/core';
import { Router } from '@angular/router';

import { Payment } from '../models/payment.model';
import { Payment1Service } from '../payment1/payment1.service';

@Component({
  templateUrl: './add-payment1.component.html'
})
export class AddPaymentComponent {

  payment1: Payment = new Payment();

  constructor(private router: Router, private payment1Service: Payment1Service) {

  }

  createPayment(): void {
    this.payment1Service.createPayment(this.payment1)
        .subscribe( data => {
          alert("Payment Module added successfully.");
        });

  };

}
