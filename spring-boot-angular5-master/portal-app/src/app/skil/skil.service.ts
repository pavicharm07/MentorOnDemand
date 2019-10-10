import {Injectable} from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

import { Training } from '../models/training.model';
import { User } from '../models/user.model';
import { Payment } from '../models/payment.model';
import { Skill } from '../models/skill.model';


const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};

@Injectable()
export class SkilService {
  id=sessionStorage.getItem('mentorid')
  

  constructor(private http:HttpClient) {}

  private trainingUrl = 'http://localhost:8090/trainings';
  private paymentUrl = 'http://localhost:8090/payments';
  private skillUrl='http://localhost:8090/skills'
  //private userUrl = '/api';

  public getTraining() {
    this.id=sessionStorage.getItem('mentorid')
    return this.http.get<Training[]>(this.trainingUrl+"/findTrainingByMentorId/"+this.id);
  }
  
 
  public deleteTraining(training) {
    return this.http.delete(this.trainingUrl + "/"+ training.id);
  }

  public createTraining(training) {
    return this.http.post<Training>(this.trainingUrl, training);
  }
  public getPayment() {
    this.id=sessionStorage.getItem('mentorid')
   
    return this.http.get<Payment[]>(this.paymentUrl + "/findPaymentBymentor/"+ this.id);
  } 
  public getSkilby(trainingId) {
  
      
        return this.http.get<Skill[]>(this.skillUrl+"/findskillByTrainingId/"+trainingId);
      }

}
