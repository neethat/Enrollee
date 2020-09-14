import { Enrollee } from './../enrollee';
import { Component, OnInit, Input } from '@angular/core';
import { EnrolleeService } from '../enrollee.service';
import { EnrolleeListComponent } from '../enrollee-list/enrollee-list.component';


@Component({
  selector: 'app-enrollee-details',
  templateUrl: './enrollee-details.component.html',
  styleUrls: ['./enrollee-details.component.css']
})
export class EnrolleeDetailsComponent implements OnInit {

  @Input() enrollee: Enrollee;

  constructor(private enrolleeService: EnrolleeService, private listComponent: EnrolleeListComponent) { }

  ngOnInit() {
  }
}

}
