import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Observable } from 'rxjs';
import { observableToBeFn } from 'rxjs/internal/testing/TestScheduler';
import { Account } from './Account';

@Injectable({
  providedIn: 'root'
})
export class AcountService {
  private baseUrl: String = "http://localhost:8081/account";
  constructor(private http : HttpClient) { }

  public getAccountByEmail(email:String):Observable<Account>{
    return this.http.get<Account>(`${this.baseUrl}/byEmail/${email}`);
  }

  public createAccount(accountAdded: Account):Observable<any>{
    return this.http.post<any>(`${this.baseUrl}/createAccount`,accountAdded);
  }

  public getAllAccounts():Observable<Account[]>{
    return this.http.get<Account[]>(`${this.baseUrl}/viewAccounts`)
  }
}
