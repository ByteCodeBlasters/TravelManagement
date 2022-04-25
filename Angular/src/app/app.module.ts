import { HttpClientModule } from '@angular/common/http';
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AcountService } from './acount.service';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { PackagesService } from './packages.service';
import { PackageComponent } from './MyComponent/package/package.component';
import { HomeComponent } from './MyComponent/home/home.component';
import { FormsModule } from '@angular/forms';
import { GalleryComponent } from './MyComponent/gallery/gallery.component';
import { ReviewComponent } from './MyComponent/review/review.component';
import { HeaderComponent } from './MyComponent/header/header.component';
import { FooterComponent } from './MyComponent/footer/footer.component';
import { UserViewComponent } from './MyComponent/user-view/user-view.component';

@NgModule({
  declarations: [
    AppComponent,
    PackageComponent,
    HomeComponent,
    GalleryComponent,
    ReviewComponent,
    HeaderComponent,
    FooterComponent,
    UserViewComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [PackagesService,AcountService],
  bootstrap: [AppComponent]
})
export class AppModule { }
