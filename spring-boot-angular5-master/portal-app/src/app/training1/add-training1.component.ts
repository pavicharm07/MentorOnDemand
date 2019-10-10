import { Component } from '@angular/core';
import { Router } from '@angular/router';

import { Training } from '../models/training.model';
import { Training1Service } from '../training1/training1.service';

@Component({
  templateUrl: './add-training1.component.html'
})
export class AddTraining1Component {

  training1: Training = new Training();

  constructor(private router: Router, private training1Service: Training1Service) {

  }

  createTraining(): void {
    this.training1Service.createTraining(this.training1)
        .subscribe( data => {
          alert("Training Module added successfully.");
        });

  };

}
