import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import { Skill } from '../models/skill.model';
import { SkillService } from './skill.service';

@Component({
  selector: 'app-skill',
  templateUrl: './skill.component.html',
  styles: []
})
export class SkillComponent implements OnInit {

  skills: Skill[];

  constructor(private router: Router, private skillService: SkillService) {

  }

  ngOnInit() {
    this.skillService.getSkill()
      .subscribe( data => {
        this.skills = data;
      });
  };

  deleteSkill(skill: Skill): void {
    this.skillService.deleteSkill(skill)
      .subscribe( data => {
        this.skills = this.skills.filter(u => u !== skill);
      })
  };

}


