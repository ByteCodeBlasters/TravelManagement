import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Review } from './Review';

@Injectable({
  providedIn: 'root'
})
export class ReviewService{
  private baseUrl2='http://localhost:8081/reviews'
  constructor(private http:HttpClient) { }
  public getAllReviews():Observable<Review[]> {
  return this.http.get<Review[]>(`${this.baseUrl2}/listAllReviews`)
  }

  public writeReview(reviewPassed:Review):Observable<any>{
    console.log(reviewPassed);
    return this.http.post<any>(`${this.baseUrl2}/add`,reviewPassed);
  }
  
}
