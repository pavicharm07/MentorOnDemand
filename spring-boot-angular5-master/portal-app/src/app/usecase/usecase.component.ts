import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import { UsecaseService } from './usecase.service';
import { Mentor } from '../models/mentor.model';

@Component({
  selector: 'app-usecase',
  templateUrl: './usecase.component.html',
  styles: []
})
export class UsecaseComponent implements OnInit {

  mentors: Mentor[];
  mentor : Mentor = new Mentor();


  constructor(private router: Router, private usecaseService:UsecaseService) {

  }

  ngOnInit() {
    this.usecaseService.getMentor()
      .subscribe( data => {
        this.mentor= data;
      });
  };

  deleteMentor(mentor: Mentor): void {
    this.usecaseService.deleteMentor(mentor)
      .subscribe( data => {
        this.mentors = this.mentors.filter(u => u !== mentor);
      })
  };

}


