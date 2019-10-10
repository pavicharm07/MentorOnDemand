import {Injectable} from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

import { Training } from '../models/training.model';
import { Payment } from '../models/payment.model';


const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};

@Injectable()
export class Training1Service {

  id=sessionStorage.getItem('id')
  start=sessionStorage.getItem('startDate');
  end=sessionStorage.getItem('endDate');
  

  constructor(private http:HttpClient) {}

  private trainingUrl = 'http://localhost:8090/trainings';
  private paymentUrl = 'http://localhost:8090/payments';
  //private userUrl = '/api';

  public getTraining() {
    this.id=sessionStorage.getItem('id')
    return this.http.get<Training[]>(this.trainingUrl+"/findTrainingByUsersId/"+this.id);
  }
  public getTrainingstartendDate(){
    this.start=sessionStorage.getItem('startDate');
    this.end=sessionStorage.getItem('endDate');
    
    return this.http.get<Training[]>(this.trainingUrl + "/findBystartDateBetween/"+ this.start+"/"+this.end);
  }

  public getPaymentby(trainingId) {
    let id = sessionStorage.getItem('id');
      
        return this.http.get<Payment[]>(this.paymentUrl+"/findPaymentByTrainingIdandUsersId/"+trainingId+"/"+id);
      }
  public getPayment() {
    this.id=sessionStorage.getItem('id');
   
    return this.http.get<Payment[]>(this.paymentUrl + "/findPaymentByUsersId/"+ this.id);
  }
  public enrollUser(training){
    return this.http.put<Training>(this.trainingUrl, training);
  }
  
  public deleteTraining(training) {
    return this.http.delete(this.trainingUrl + "/"+ training.id);
  }

  public createTraining(training) {
    return this.http.post<Training>(this.trainingUrl, training);
  }
  
}
