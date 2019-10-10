import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import { User } from '../models/user.model';
import { AsigninService } from './asignin.service';

@Component({
  selector: 'app-receipt',
  templateUrl: './asignin.component.html',
  styles: []
})
export class AsigninComponent {

  users: User[];

  constructor(private router: Router, private asigninService: AsigninService) {

  }

  validate(userName, password): void{
    
    if(userName=="admin" || password=="admin123"){
      this.router.navigate(['admin1']);
      
    }
    else {
      alert("Invalid Username or Password!");
    }
  }
};





