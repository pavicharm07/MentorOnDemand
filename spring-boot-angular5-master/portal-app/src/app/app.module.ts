import { BrowserModule } from '@angular/platform-browser';
import { NgModule,  CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { FormsModule } from '@angular/forms';

import { AppComponent } from './app.component';
import { UserComponent } from './user/user.component';
import { MentorComponent } from './mentor/mentor.component';
import { SigninComponent } from './signin/signin.component';
import { SignupComponent } from './signup/signup.component';
import {LearningComponent } from './learning/learning.component';
import {CourseComponent } from './course/course.component';
import {CoursedetailsComponent } from './coursedetails/coursedetails.component';
import {UsertrainingsComponent } from './usertrainings/usertrainings.component';
import {Admin1Component } from './admin1/admin1.component';
import {FeeComponent } from './fee/fee.component';
import {AsigninComponent } from './asignin/asignin.component';
import {MsigninComponent } from './msignin/msignin.component';
import {TechnologyComponent } from './technology/technology.component';
import {PaymentComponent } from './payment/payment.component';


import { PayComponent } from './pay/pay.component';
import { UsecaseComponent } from './usecase/usecase.component';
import { OpaymentComponent } from './opayment/opayment.component';
import { ReceiptComponent } from './receipt/receipt.component';
import { SkilComponent } from './skil/skil.component';
import {TrainerprofileComponent } from './trainerprofile/trainerprofile.component';
import {AvailablecComponent } from './availablec/availablec.component';
import {TrainerdetailsComponent } from './trainerdetails/trainerdetails.component';
import {IndexComponent } from './index/index.component';
import {Mentor1Component } from './mentor1/mentor1.component';
import {ContactComponent } from './contact/contact.component';
import { AppRoutingModule } from './app.routing.module';
import {UserService} from './user/user.service';
import {SigninService} from './signin/signin.service';
import {OpaymentService} from './opayment/opayment.service';
import {SignupService} from './signup/signup.service';
import {UsertrainingsService} from './usertrainings/usertrainings.service';
import {Admin1Service} from './admin1/admin1.service';
import {CourseService} from './course/course.service';
import {LearningService} from './learning/learning.service';
import {TrainerprofileService} from './trainerprofile/trainerprofile.service';
import {FeeService} from './fee/fee.service';
import {PayService} from './pay/pay.service';
import {HttpClientModule} from "@angular/common/http";
import {AddUserComponent} from './user/add-user.component';
import {AddMentorComponent} from './mentor/add-mentor.component';
import {AddTechnologyComponent} from './technology/add-technology.component';
import {AddPaymentComponent} from './payment/add-payment.component';
import {SkilService} from './skil/skil.service';
import {ReceiptService} from './receipt/receipt.service';
import {AvailablecService} from './availablec/availablec.service';
import {TrainerdetailsService} from './trainerdetails/trainerdetails.service';
import {Mentor1Service} from './mentor1/mentor1.service';
import {UsecaseService} from './usecase/usecase.service';
import {CoursedetailsService} from './coursedetails/coursedetails.service';
import {ContactService} from './contact/contact.service';
import {IndexService} from './index/index.service';
import {AsigninService} from './asignin/asignin.service';
import {MsigninService} from './msignin/msignin.service';
import {MentorService} from './mentor/mentor.service';
import {TechnologyService} from './technology/technology.service';
import {PaymentService} from './payment/payment.service';
import { SkillComponent } from './skill/skill.component';
import { AddSkillComponent } from './skill/add-skill.component';
import { SkillService } from './skill/skill.service';
import { TrainingComponent } from './training/training.component';
import { AddTrainingComponent } from './training/add-training.component';
import { TrainingService } from './training/training.service';
import { Training1Component } from './training1/training1.component';
import { Training1Service } from './training1/training1.service';
import { Payment1Component } from './payment1/payment1.component';
import { Payment1Service } from './payment1/payment1.service';
import { UserAdminComponent } from './user/useradmin.component';
import { MentorAdminComponent } from './mentor/mentoradmin.component';
import { AprofileComponent } from './aprofile/aprofile.component';
import { AprofileService } from './aprofile/aprofile.service';
import { NgCircleProgressModule } from 'ng-circle-progress';
import { TrainingpayComponent } from './trainingpay/trainingpay.component';
import { TrainingpayService } from './trainingpay/trainingpay.service';
import { TrainingsearchComponent } from './training1/trainingsearch.component';
import { PayslipComponent } from './training1/payslip.component';
import { SkilslipComponent } from './skil/skilslip.component';
import { UseraddComponent } from './admin1/useradd.component';
import { MentoraddComponent } from './admin1/mentoradd.component';
import { TechnologyaddComponent } from './mentor1/technologyadd.component';
import { Technology1Component } from './mentor1/technology1.component';
import { Contact1Component } from './aprofile/Contact1.component';
import { Contact2Component } from './usecase/Contact2.component';













@NgModule({
  declarations: [
    AppComponent,
    UserComponent,
    AddUserComponent,
    SigninComponent,
    SignupComponent,
    LearningComponent,
    Admin1Component,
    CourseComponent,
    UsertrainingsComponent,
    FeeComponent,
    TrainerprofileComponent,
    PayComponent,
    SkilComponent,
    ReceiptComponent,
    AvailablecComponent,
    TrainerdetailsComponent,
      Mentor1Component,
      MentorComponent,
      UsecaseComponent,
      OpaymentComponent,
      CoursedetailsComponent,
      ContactComponent,
      IndexComponent,
      AsigninComponent,
      MsigninComponent,
      AddMentorComponent,
      AddTechnologyComponent,
      TechnologyComponent,
      PaymentComponent,
      AddPaymentComponent,
      SkillComponent,
      AddSkillComponent,
      TrainingComponent,
      AddTrainingComponent,
      Training1Component,
      Payment1Component,
      UserAdminComponent,
      MentorAdminComponent,
      AprofileComponent,
      TrainingpayComponent,
      TrainingsearchComponent,
      PayslipComponent,
      SkilslipComponent,
      UseraddComponent,
      MentoraddComponent,
      TechnologyaddComponent,
      Technology1Component,
      Contact1Component,
      Contact2Component
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,





    NgCircleProgressModule.forRoot({
      radius: 25,
      outerStrokeWidth: 8,
      innerStrokeWidth: 4,
      outerStrokeColor: "#78C000",
      innerStrokeColor: "#C7E596",
      animationDuration: 200,
      
    })
  ],
  providers: [UserService,SigninService,TrainingpayService,AprofileService,SignupService,LearningService,Admin1Service,CourseService,Payment1Service,
                       UsertrainingsService,FeeService,TrainerprofileService,PayService,SkilService,SkillService,TrainingService,
                       ReceiptService,AvailablecService,TrainerdetailsService,Mentor1Service,MentorService,UsecaseService,OpaymentService,
                       CoursedetailsService,ContactService,IndexService,AsigninService,MsigninService,TechnologyService,PaymentService,Training1Service,],
  bootstrap: [AppComponent],
  schemas: [ CUSTOM_ELEMENTS_SCHEMA ]
})
export class AppModule { }
