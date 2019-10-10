import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import { User } from '../models/user.model';
import { PayService } from './pay.service';

@Component({
  selector: 'app-payment',
  templateUrl: './pay.component.html',
  styles: []
})
export class PayComponent implements OnInit {

  users: User[];

  constructor(private router: Router, private payService: PayService) {

  }

  ngOnInit() {
    this.payService.getUsers()
      .subscribe( data => {
        this.users = data;
      });
  };

  deleteUser(user: User): void {
    this.payService.deleteUser(user)
      .subscribe( data => {
        this.users = this.users.filter(u => u !== user);
      })
  };

}


