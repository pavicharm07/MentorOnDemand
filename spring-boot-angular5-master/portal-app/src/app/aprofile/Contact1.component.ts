import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import { User } from '../models/user.model';
import { ContactService } from '../contact/contact.service';

@Component({
  selector: 'app-receipt',
  templateUrl: './Contact1.component.html',
  styles: []
})
export class Contact1Component implements OnInit {

  users: User[];

  constructor(private router: Router, private contactService: ContactService) {

  }

  ngOnInit() {
    this.contactService.getUsers()
      .subscribe( data => {
        this.users = data;
      });
  };

  deleteUser(user: User): void {
    this.contactService.deleteUser(user)
      .subscribe( data => {
        this.users = this.users.filter(u => u !== user);
      })
  };

}


