import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Package } from './package';

@Injectable({
  providedIn: 'root'
})
export class PackagesService {
  private apiServerUrl ="http://localhost:8081/package";

  constructor(private http : HttpClient) {}
  public getPackages(): Observable<Package[]>{
    return this.http.get<Package[]>(`${this.apiServerUrl}/listAll`);
  }

  public updatePackages(packageTo : Package):Observable<Package>{
    return this.http.put<Package>(`${this.apiServerUrl}/update`, packageTo);
  }

  public addPackages(packageTo: Package): Observable<Package>{
    return this.http.post<Package>(`${this.apiServerUrl}/add`,packageTo);
  }

  public deletePackage(packageId:number):void{
     this.http.delete(`${this.apiServerUrl}/delete/`+`${packageId}`);
  }
}
