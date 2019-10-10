import {Injectable} from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

import { Mentor } from '../models/mentor.model';


const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};

@Injectable()
export class MentorService {
 
  
 

  constructor(private http:HttpClient) {}

  private mentorUrl = 'http://localhost:8090/mentors';
  //private userUrl = '/api';

  public getMentor() {
    return this.http.get<Mentor[]>(this.mentorUrl);
  }

  public deleteMentor(mentor) {
    return this.http.delete(this.mentorUrl + "/"+ mentor.id);
  }

  public createMentor(mentor) {
    return this.http.post<Mentor>(this.mentorUrl, mentor);
  }
  public updateMentor(mentor) {
    return this.http.put<Mentor[]>(this.mentorUrl + "/update/"+ mentor.id,mentor);
  }
  public activeData()
  {
    return this.http.get<Mentor[]>(this.mentorUrl+"/active/true")
  }

}
