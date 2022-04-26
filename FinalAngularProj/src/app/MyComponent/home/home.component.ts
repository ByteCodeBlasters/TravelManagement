import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';
import { Account } from 'src/app/Account';
import { AcountService } from 'src/app/acount.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  public accounts : Account[]=[];
  public account!: Account;
  email!: String;
  password!: String;
  constructor(private accountService: AcountService, private router: Router) { }

  ngOnInit(): void {
  }

  public getAll():void{
    this.accountService.getAllAccounts().subscribe(
      (data)=>{
        this.accounts=data;
      }
    )
  }
  public getPassword(email:String):void{
    this.accountService.getAccountByEmail(email).subscribe(
      (data)=>{
        this.account=data;
      }
      
    )
   
  }
  public validate(loginForm:NgForm):void{

    if(loginForm.value.email=="admin@gmail.com" && loginForm.value.password=="admin@123"){
       this.router.navigate(['/package'])
     }
     
     else if(this.account==null){
      alert("You don't have an account")
     }
     else if(this.account!=null){
     this.email=this.account.email
     this.password=this.account.password
      if(loginForm.value.email==this.email&&loginForm.value.password==this.password){
       this.router.navigate(['/userView'])
     }
     else{
       alert("Either the email and password does not match")
     }
  }
}
  public openModal():void{
    let con = document.getElementById("myLoginModal");
    con?.setAttribute("style",'display:none;');
    con=document.getElementById("myRegistrationModal");
    con?.setAttribute('style','display:block;')
  }

  public addAccount(registerForm:NgForm):void{
    console.log(registerForm.value.email)
    this.accountService.getAccountByEmail(registerForm.value.email).subscribe(
      (data)=>{
        this.account=data;
      }
    )

    if(this.account==null){
      this.accountService.createAccount(registerForm.value).subscribe(
        (data)=>{
          console.log(data);
        }
      )
      window.location.reload()
    }
    else{
      alert("You already have an account")
    }
    
}
}
