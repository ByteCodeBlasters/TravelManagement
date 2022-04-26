import { Component, OnInit } from '@angular/core';
import { Package } from 'src/app/package';
import { PackagesService } from 'src/app/packages.service';
import { PackageComponent } from '../package/package.component';

@Component({
  selector: 'app-gallery',
  templateUrl: './gallery.component.html',
  styleUrls: ['./gallery.component.css']
})
export class GalleryComponent implements OnInit {
  pokemon:Package[]=[];
  constructor(private packageServices : PackagesService) { }

  ngOnInit(): void {
    this.getPackages();
  }

  public getPackages():void{
    this.packageServices.getPackages().subscribe(
      (data)=>{
        this.pokemon=data
        console.log(this.pokemon)
      })
  }
}
