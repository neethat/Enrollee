import { EnrolleeListComponent } from './enrollee-details/enrollee-details.component';
import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { EnrolleeListComponent } from './enrollee-list/enrollee-list.component';

const routes: Routes = [
  { path: '', redirectTo: 'enrollee', pathMatch: 'full' },
  { path: 'enrollees', component: EnrolleeListComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})


export class AppRoutingModule { }
