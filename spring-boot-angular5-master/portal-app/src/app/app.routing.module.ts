import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { UserComponent } from './user/user.component';
import { AddUserComponent} from './user/add-user.component';
import { MentorComponent } from './mentor/mentor.component';
import { AddMentorComponent} from './mentor/add-mentor.component';
import { SigninComponent } from './signin/signin.component';
import { SignupComponent } from './signup/signup.component';
import { LearningComponent } from './learning/learning.component';
import { Admin1Component } from './admin1/admin1.component';
import { CourseComponent } from './course/course.component';
import { UsertrainingsComponent } from './usertrainings/usertrainings.component';
import { FeeComponent } from './fee/fee.component';
import { TrainerprofileComponent } from './trainerprofile/trainerprofile.component';
import { SkilComponent } from './skil/skil.component';
import { ReceiptComponent } from './receipt/receipt.component';
import { AvailablecComponent } from './availablec/availablec.component';
import { TrainerdetailsComponent } from './trainerdetails/trainerdetails.component';
import { Mentor1Component } from './mentor1/mentor1.component';
import { UsecaseComponent } from './usecase/usecase.component';
import { OpaymentComponent } from './opayment/opayment.component';
import { CoursedetailsComponent } from './coursedetails/coursedetails.component';
import { ContactComponent } from './contact/contact.component';
import { IndexComponent } from './index/index.component';
import { AsigninComponent } from './asignin/asignin.component';
import { MsigninComponent } from './msignin/msignin.component';
import { AddTechnologyComponent } from './technology/add-technology.component';
import { TechnologyComponent } from './technology/technology.component';
import { PayComponent } from './pay/pay.component';
import { PaymentComponent } from './payment/payment.component';
import { AddPaymentComponent } from './payment/add-payment.component';
import { AddSkillComponent } from './skill/add-skill.component';
import { SkillComponent } from './skill/skill.component';
import { TrainingComponent } from './training/training.component';
import { AddTrainingComponent } from './training/add-training.component';
import { Training1Component } from './training1/training1.component';
import { Payment1Component } from './payment1/payment1.component';
import { UserAdminComponent } from './user/useradmin.component';
import { MentorAdminComponent } from './mentor/mentoradmin.component';
import { AprofileComponent } from './aprofile/aprofile.component';
import { TrainingpayComponent } from './trainingpay/trainingpay.component';
import { TrainingsearchComponent } from './training1/trainingsearch.component';
import { PayslipComponent } from './training1/payslip.component';
import { SkilslipComponent } from './skil/skilslip.component';
import { UseraddComponent } from './admin1/useradd.component';
import { MentoraddComponent } from './admin1/mentoradd.component';
import { TechnologyaddComponent } from './mentor1/technologyadd.component';
import { Technology1Component } from './mentor1/technology1.component';
import { Contact1Component } from './aprofile/Contact1.component';
import { Contact2Component } from './usecase/Contact2.component';













const routes: Routes = [
  { path: 'users', component: UserComponent },
  { path: 'add', component: AddUserComponent },
   { path: 'signin', component: SigninComponent },
   { path: 'signup', component: SignupComponent },
   { path: 'learning', component: LearningComponent },
   { path: 'admin1', component: Admin1Component },
   { path: 'course', component: CourseComponent },
   { path: 'usertrainings', component: UsertrainingsComponent },
   { path: 'fee', component: FeeComponent },
   { path: 'trainerprofile', component: TrainerprofileComponent },
   { path: 'pay', component: PayComponent },
   { path: 'skil', component: SkilComponent },
   { path: 'receipt', component: ReceiptComponent },
   { path: 'availablec', component: AvailablecComponent },
   { path: 'trainerdetails', component: TrainerdetailsComponent },
   { path: 'mentor1', component: Mentor1Component },
   { path: 'usecase', component: UsecaseComponent },
   { path: 'opayment', component: OpaymentComponent },
   { path: 'coursedetails', component: CoursedetailsComponent },
   { path: 'contact', component: ContactComponent },
   { path: 'index', component: IndexComponent },
   { path: 'asignin', component: AsigninComponent },
   { path: 'msignin', component: MsigninComponent },
   { path: 'mentors', component: MentorComponent },
   { path: 'mentor', component: AddMentorComponent },
   { path: 'technologies', component: AddTechnologyComponent },
   { path: 'technology', component: TechnologyComponent },
   { path: 'payments', component: PaymentComponent },
   { path: 'payment', component: AddPaymentComponent },
   { path: 'skill', component: AddSkillComponent },
   { path: 'skills', component: SkillComponent },
   { path: 'trainings', component: TrainingComponent },
   { path: 'training', component: AddTrainingComponent },
   { path: 'training1', component: Training1Component },
   { path: 'payment1', component: Payment1Component },
   { path: 'useradmin', component: UserAdminComponent },
   { path: 'mentoradmin', component: MentorAdminComponent },
   { path: 'aprofile', component: AprofileComponent },
   { path: 'trainingpay', component: TrainingpayComponent },
   { path: 'trainingsearch', component: TrainingsearchComponent },
   { path: 'payslip', component: PayslipComponent },
   { path: 'skilslip', component: SkilslipComponent },
   { path: 'useradd', component: UseraddComponent },
   { path: 'mentoradd', component: MentoraddComponent },
   { path: 'technologyadd', component: TechnologyaddComponent },
   { path: 'technology1', component: Technology1Component },
   { path: 'contact1', component: Contact1Component },
   { path: 'contact2', component: Contact2Component },
   
   


];

@NgModule({
  imports: [
    RouterModule.forRoot(routes)
  ],
  exports: [
    RouterModule
  ],
  declarations: []
})
export class AppRoutingModule { }
