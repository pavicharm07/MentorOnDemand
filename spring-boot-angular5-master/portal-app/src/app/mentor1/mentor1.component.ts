import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import { User } from '../models/user.model';
import { Mentor1Service } from './mentor1.service';

@Component({
  selector: 'app-mentor',
  templateUrl: './mentor1.component.html',
  styles: []
})
export class Mentor1Component implements OnInit {

  users: User[];

  constructor(private router: Router, private mentor1Service: Mentor1Service) {

  }

  ngOnInit() {
    this.mentor1Service.getUsers()
      .subscribe( data => {
        this.users = data;
      });
  };

  deleteUser(user: User): void {
    this.mentor1Service.deleteUser(user)
      .subscribe( data => {
        this.users = this.users.filter(u => u !== user);
      })
  };

}


