import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Observable } from 'rxjs';
import { Package } from 'src/app/package';
import { PackagesService } from 'src/app/packages.service';

@Component({
  selector: 'app-package',
  templateUrl: './package.component.html',
  styleUrls: ['./package.component.css']
})
export class PackageComponent implements OnInit {
  packages: Package[]=[];
  updatePackage!:Package|null;
  public deletePackage!: Package|null;
  public deletepackageid!:number;

  constructor(private packageService : PackagesService){}

    ngOnInit(){
      this.getPackages();
    }

  public getPackages():void{
    this.packageService.getPackages().subscribe(
      (data)=>{
        this.packages=data
        console.log(this.packages)
      })
  }

  public onAddPackage(addForm:NgForm):void{
    this.packageService.addPackages(addForm.value).subscribe(
      (data)=>{
        console.log(addForm.value);
      }
    )
    document.getElementById("closeButtonOfAddPackage")?.click();
    window.location.reload()
  }

  public onUpdatePackage(packageUpdate : Package):void{
    this.packageService.updatePackages(packageUpdate).subscribe(
      (data)=>{
        console.log(data);
      }
    )
    document.getElementById("closeButtonOfUpdatePackage")?.click()
    window.location.reload();
  }

  public onDeletePackage(delId:number):void{
    this.packageService.deletePackage(delId);
    document.getElementById("closeButtonOfDeletePackage")?.click()
    window.location.reload()
  }

  public openAndCloseModal(packagePassed:Package|null, dot: string, mode:String){
    if(dot ==='open'&& mode==='add'){
    let openModal= document.getElementById("addPackage")
    openModal?.setAttribute('style','display:block;')
    }
    if(dot ==='close' && mode==='add'){
      let closeModal =document.getElementById("addPackage")
      closeModal?.setAttribute('style','display:none;')  
    }
    if(dot ==='open'&& mode==='update'){
      let openModal= document.getElementById("updatePackage")
      openModal?.setAttribute('style','display:block;')
       this.updatePackage = packagePassed;
      console.log(this.updatePackage?.destination);
    }
    if(dot ==='close' && mode==='update'){
        let closeModal =document.getElementById("updatePackage")
        closeModal?.setAttribute('style','display:none;')
    }
    if(dot ==='close' && mode==='delete'){
        let closeModal =document.getElementById("deletePackage")
        closeModal?.setAttribute('style','display:none;')

    }
  }

    public openAndCloseDelete(i:number , dot:String):void{
      this.deletepackageid=this.packages[i].packageId;
      console.log('In open delete id '+this.deletepackageid)
      if(dot ==='open'){
        let openModal= document.getElementById("deletePackage")
        openModal?.setAttribute('style','display:block;')
      }
    }
  }