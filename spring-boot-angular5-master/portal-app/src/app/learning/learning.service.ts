import {Injectable} from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

import { User } from '../models/user.model';
import { Training } from '../models/training.model';


const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};

@Injectable()
export class LearningService {


  constructor(private http:HttpClient) {}

  private userUrl = 'http://localhost:8090/users';
  private trainingUrl = 'http://localhost:8090/trainings';
  //private userUrl = '/api';

  public getUsers() {
    return this.http.get<User[]>(this.userUrl);
  }

  public deleteUser(user) {
    return this.http.delete(this.userUrl + "/"+ user.id);
  }

  public createUser(user) {
    return this.http.post<User>(this.userUrl, user);
  }
  public findtraining(startDate, endDate){
   
    return this.http.get<Training>(this.trainingUrl + "/findBystartDateBetween/"+startDate + "/" + endDate);
  }
}
