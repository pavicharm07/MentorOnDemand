import { Component } from '@angular/core';
import { Router } from '@angular/router';

import { Mentor } from '../models/mentor.model';
import { MentorService } from '../mentor/mentor.service';

@Component({
  templateUrl: './mentoradd.component.html'
})
export class MentoraddComponent {

  mentor: Mentor = new Mentor();

  constructor(private router: Router, private mentorService: MentorService) {

  }

  createMentor(): void {
    this.mentorService.createMentor(this.mentor)
        .subscribe( data => {
          alert("Mentor created successfully.");
        });

  };

}
