import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import { User } from '../models/user.model';
import { FeeService } from './fee.service';

@Component({
  selector: 'app-fee',
  templateUrl: './fee.component.html',
  styles: []
})
export class FeeComponent implements OnInit {

  users: User[];

  constructor(private router: Router, private feeService: FeeService) {

  }

  ngOnInit() {
    this.feeService.getUsers()
      .subscribe( data => {
        this.users = data;
      });
  };

  deleteUser(user: User): void {
    this.feeService.deleteUser(user)
      .subscribe( data => {
        this.users = this.users.filter(u => u !== user);
      })
  };

}


