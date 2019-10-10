import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import { User } from '../models/user.model';
import { IndexService } from './index.service';

@Component({
  selector: 'app-receipt',
  templateUrl: './index.component.html',
  styles: []
})
export class IndexComponent implements OnInit {

  users: User[];

  constructor(private router: Router, private indexService: IndexService) {

  }

  ngOnInit() {
    this.indexService.getUsers()
      .subscribe( data => {
        this.users = data;
      });
  };

  deleteUser(user: User): void {
    this.indexService.deleteUser(user)
      .subscribe( data => {
        this.users = this.users.filter(u => u !== user);
      })
  };

}


