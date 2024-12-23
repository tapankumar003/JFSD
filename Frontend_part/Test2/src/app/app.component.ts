import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { HomeComponent } from './components/home/home.component';
import { AboutComponent } from './components/about/about.component';
import { UserComponent } from './components/user/user.component';
import { RouterLink } from '@angular/router';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: 
  [
    RouterOutlet,
    RouterLink,
    HomeComponent,
    AboutComponent,
    UserComponent
  ],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'Test2';

  // #############if and for exp ##############################
  // show =false;
  // users =['a','b','c','d','e']
  // students = [
  //   {
  //     id:1,
  //     name:'Sritam',
  //     class:{cls:'1',sec:'a'}
  //   },
  //   {
  //     id:2,
  //     name:'Tapan',
  //     class:{cls:'2',sec:'b'}
  //   },
  //   {
  //     id:3,
  //     name:'Lara',
  //     class:{cls:'3',sec:'c'}
  //   }

  // ]


}
