import { Observable } from "rxjs";
import { EnrolleeService } from "./../enrollees.service";
import { Enrollee } from "./../enrollee";
import { Component, OnInit } from "@angular/core";


@Component({
  selector: 'app-enrollee-list',
  templateUrl: './enrollee-list.component.html',
  styleUrls: ['./enrollee-list.component.css']
})
export class EnrolleeListComponent implements OnInit {
  
  enrollees: Observable<Enrollee[]>;
  constructor(private enrolleeService: EnrolleeService) {}
 
  ngOnInit() {
    this.reloadData();
  }

  reloadData() {
    this.enrollees = this.employeeService.getEnrolleeList();
  }

}
