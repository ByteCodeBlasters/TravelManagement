import { Component, OnInit } from '@angular/core';
import { Package } from 'src/app/package';
import { PackagesService } from 'src/app/packages.service';

@Component({
  selector: 'app-user-view',
  templateUrl: './user-view.component.html',
  styleUrls: ['./user-view.component.css']
})
export class UserViewComponent implements OnInit {
  packages: Package[]=[];
  constructor(private packageService : PackagesService) { }

  ngOnInit(): void {
    this.getPackages()
  }
  public getPackages():void{
    this.packageService.getPackages().subscribe(
      (data)=>{
        this.packages=data
        console.log(this.packages)
      })
  }

}
