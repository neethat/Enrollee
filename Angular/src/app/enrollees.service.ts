import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';


@Injectable({
  providedIn: 'root'
})
export class EnrolleesService {
  private baseUrl = '/api/Enrollee/enrollee';
  
  constructor(private http: HttpClient) { }
  
  
  getEnrollee(id: number): Observable<Object> {
    return this.http.get(`${this.baseUrl}/${id}`);
  }

  updateEnrollee(id: number, value: any): Observable<Object> {
    return this.http.put(`${this.baseUrl}/${id}`, value);
  }

   getEnrolleeList(): Observable<any> {
    return this.http.get(`${this.baseUrl}`);
  }

}
