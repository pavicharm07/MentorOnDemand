import { Component } from '@angular/core';
import { Router } from '@angular/router';

import { Technology } from '../models/technology.model';
import { TechnologyService } from '../technology/technology.service';

@Component({
  templateUrl: './technologyadd.component.html'
})
export class TechnologyaddComponent {

  technology: Technology = new Technology();

  constructor(private router: Router, private technologyService: TechnologyService) {

  }

  createTechnology(): void {
    this.technologyService.createTechnology(this.technology)
        .subscribe( data => {
          alert("Technology created successfully.");
        });

  };

}
