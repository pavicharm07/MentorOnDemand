import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { Training1Component } from './training1.component';

describe('Training1Component', () => {
  let component: Training1Component;
  let fixture: ComponentFixture<Training1Component>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ Training1Component ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(Training1Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
