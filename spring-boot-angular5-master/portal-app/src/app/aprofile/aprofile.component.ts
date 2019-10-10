import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import { User } from '../models/user.model';
import { AprofileService } from './aprofile.service';

@Component({
  selector: 'app-aprofile',
  templateUrl: './aprofile.component.html',
  styles: []
})
export class AprofileComponent implements OnInit {

  users: User[];
  user : User = new User();
  constructor(private router: Router, private aprofileService:AprofileService) {

  }

  ngOnInit() {
    this.aprofileService.getUser()
      .subscribe( data => {
        this.user = data;
      });
  };
 
  deleteUser(user: User): void {
    this.aprofileService.deleteUser(user)
      .subscribe( data => {
        this.users = this.users.filter(u => u !== user);
      })
  };

}


