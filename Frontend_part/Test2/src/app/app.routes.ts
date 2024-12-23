import { Routes } from '@angular/router';
import { HomeComponent } from './components/home/home.component';
import { AboutComponent } from './components/about/about.component';
import { UserComponent } from './components/user/user.component';

export const routes: Routes = [
    {path:'',component:HomeComponent},
    {path:'about', component:AboutComponent},
    {path:'user',component:UserComponent},
    {path:'user/:id',component:UserComponent}
];
