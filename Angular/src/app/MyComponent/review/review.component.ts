import { Component, OnInit } from '@angular/core';
import { ReviewService } from 'src/app/review.service';
import { Review } from 'src/app/Review';
import { NgForm } from '@angular/forms';
@Component({
  selector: 'app-review',
  templateUrl: './review.component.html',
  styleUrls: ['./review.component.css']
})
export class ReviewComponent implements OnInit {
  reviews:Review[]=[];
  constructor(private reviewService : ReviewService) { }

  ngOnInit(): void {
    this.getReviews()
  }

  public getReviews():void{
    this.reviewService.getAllReviews().subscribe(
      (data)=>{
        this.reviews=data;
        console.log(this.reviews)
      }
    )
  }

  public writeReview(reviewForm : NgForm):void{
    this.reviewService.writeReview(reviewForm.value).subscribe(
      (data: any)=>{
        console.log(data);
      }
    )
    console.log(reviewForm.value);
    document.getElementById("closeButtonOfReview")?.click()
    window.location.reload()
  }

  public openAndCloseModal(type:String){
    if(type==='open'){
      document.getElementById('writeReview')?.setAttribute('style','display:block')
    }
    if(type==='close'){
      document.getElementById('writeReview')?.setAttribute('style','display:none')
    }
  }
}
