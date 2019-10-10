import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import { User } from '../models/user.model';
import { AvailablecService } from './availablec.service';

@Component({
  selector: 'app-availablec',
  templateUrl: './availablec.component.html',
  styles: []
})
export class AvailablecComponent implements OnInit {

  users: User[];

  constructor(private router: Router, private availablecService: AvailablecService) {

  }

  ngOnInit() {
    this.availablecService.getUsers()
      .subscribe( data => {
        this.users = data;
      });
  };

  deleteUser(user: User): void {
    this.availablecService.deleteUser(user)
      .subscribe( data => {
        this.users = this.users.filter(u => u !== user);
      })
  };

}


