import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import { User } from '../models/user.model';
import { TrainerdetailsService } from './trainerdetails.service';

@Component({
  selector: 'app-trainerdetails',
  templateUrl: './trainerdetails.component.html',
  styles: []
})
export class TrainerdetailsComponent implements OnInit {

  users: User[];

  constructor(private router: Router, private trainerdetailsService: TrainerdetailsService) {

  }

  ngOnInit() {
    this.trainerdetailsService.getUsers()
      .subscribe( data => {
        this.users = data;
      });
  };

  deleteUser(user: User): void {
    this.trainerdetailsService.deleteUser(user)
      .subscribe( data => {
        this.users = this.users.filter(u => u !== user);
      })
  };

}


