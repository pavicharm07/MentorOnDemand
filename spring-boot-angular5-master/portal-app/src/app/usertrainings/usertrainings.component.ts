import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import { User } from '../models/user.model';
import { UsertrainingsService } from './usertrainings.service';

@Component({
  selector: 'app-usertrainings',
  templateUrl: './usertrainings.component.html',
  styles: []
})
export class UsertrainingsComponent implements OnInit {

  users: User[];

  constructor(private router: Router, private usertrainingsService: UsertrainingsService) {

  }

  ngOnInit() {
    this.usertrainingsService.getUsers()
      .subscribe( data => {
        this.users = data;
      });
  };

  deleteUser(user: User): void {
    this.usertrainingsService.deleteUser(user)
      .subscribe( data => {
        this.users = this.users.filter(u => u !== user);
      })
  };

}


