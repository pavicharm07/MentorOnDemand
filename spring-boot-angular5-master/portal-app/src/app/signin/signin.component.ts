import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import { User } from '../models/user.model';
import { SigninService } from './signin.service';
import { Training } from '../models/training.model';

@Component({
  selector: 'app-signin',
  templateUrl: './signin.component.html',
  styles: []
})
export class SigninComponent implements OnInit {

  users: User[];
  user:User=new User();
  training:Training[];

  constructor(private router: Router, private signinService: SigninService) {

  }

  ngOnInit() {
    this.signinService.getUsers()
      .subscribe( data => {
        this.users = data;
      });
  };

  deleteUser(user: User): void {
    this.signinService.deleteUser(user)
      .subscribe( data => {
        this.users = this.users.filter(u => u !== user);
      })
  };
  validate(userName, password): void{
    this.signinService.validate(userName,password).subscribe(data =>{

      
      if(data==null){
        alert("Invalid Username or Password!");
      }else if(!data.active){
        alert("user is blocked!!");
      }
      else{
        sessionStorage.setItem('loggedinuser',JSON.stringify(data));
        sessionStorage.setItem('id',data.id);
        this.router.navigate(['learning']);
      }
    })
  };
  findtraining(startDate,endDate):void{
    this.signinService.findtraining(startDate,endDate).subscribe(data =>{
      if(data==null)
      {
        alert("Invalid!");
       
      }
      else{
        sessionStorage.setItem('startDate',startDate);
        sessionStorage.setItem('endDate',endDate);
        this.router.navigate(['trainingsearch']);
     
      }
    })
  };
  }






