import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import { User } from '../models/user.model';
import { CoursedetailsService } from './coursedetails.service';

@Component({
  selector: 'app-receipt',
  templateUrl: './Coursedetails.component.html',
  styles: []
})
export class CoursedetailsComponent implements OnInit {

  users: User[];

  constructor(private router: Router, private coursedetailsService: CoursedetailsService) {

  }

  ngOnInit() {
    this.coursedetailsService.getUsers()
      .subscribe( data => {
        this.users = data;
      });
  };

  deleteUser(user: User): void {
    this.coursedetailsService.deleteUser(user)
      .subscribe( data => {
        this.users = this.users.filter(u => u !== user);
      })
  };

}


