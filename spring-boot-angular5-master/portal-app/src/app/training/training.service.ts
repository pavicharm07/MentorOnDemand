import {Injectable} from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

import { Training } from '../models/training.model';


const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};

@Injectable()
export class TrainingService {
 
  constructor(private http:HttpClient) {}

  private trainingUrl = 'http://localhost:8090/trainings';
  //private userUrl = '/api';

  public getTraining() {
    return this.http.get<Training[]>(this.trainingUrl);
  }
 
  public deleteTraining(training) {
    return this.http.delete(this.trainingUrl + "/"+ training.id);
  }

  public createTraining(training) {
    return this.http.post<Training>(this.trainingUrl, training);
  }

}
