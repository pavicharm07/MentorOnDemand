import { logging } from 'protractor';
import { User } from './user.model';
import { Payment } from './payment.model';
import { Mentor } from './mentor.model';
import { Skill } from './skill.model';
import { Technology } from './technology.model';

export class Training {

  id:number;
  status: string;
  progress: string;
  fees: string;
  commissionAmount:String;
  startTime:String;
  endTime:number;
  startDate:String;
  endDate:String;
  amountReceived:number;
  amountToMentor:number;

  userId:number;
  mentorId:number;
  skillId:number;
  rating:number;
  users: User[];
  payment: Payment[];
  mentor: Mentor;
  skill: Skill[];
  technology: Technology;

}
