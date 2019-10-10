import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import { User } from '../models/user.model';
import { OpaymentService } from './opayment.service';

@Component({
  selector: 'app-receipt',
  templateUrl: './opayment.component.html',
  styles: []
})
export class OpaymentComponent implements OnInit {

  users: User[];

  constructor(private router: Router, private opaymentService: OpaymentService) {

  }

  ngOnInit() {
    this.opaymentService.getUsers()
      .subscribe( data => {
        this.users = data;
      });
  };

  deleteUser(user: User): void {
    this.opaymentService.deleteUser(user)
      .subscribe( data => {
        this.users = this.users.filter(u => u !== user);
      })
  };

}


