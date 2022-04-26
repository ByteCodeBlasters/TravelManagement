import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AppComponent } from './app.component';
import { GalleryComponent } from './MyComponent/gallery/gallery.component';
import { HomeComponent } from './MyComponent/home/home.component';
import { PackageComponent } from './MyComponent/package/package.component';
import { ReviewComponent } from './MyComponent/review/review.component';
import { UserViewComponent } from './MyComponent/user-view/user-view.component';

const routes: Routes = [
  {
    path:'package',
    component:PackageComponent
  },
  {
    path:'',
    pathMatch:"full",
    redirectTo:'home'
  },
  {
    path:'home',
    component:HomeComponent
  },
  {
    path:'gallery',
    component:GalleryComponent
  },
  {
    path:'review',
    component:ReviewComponent
  },
  {
    path:'userView',
    component:UserViewComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
