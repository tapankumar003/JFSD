import { Routes } from '@angular/router';
import { HelloComponent } from './components/hello/hello.component';
import { ChatComponent } from './components/chat/chat.component';
import { UsersComponent } from './components/users/users.component';

export const routes: Routes = [
    {path:'hello', component:HelloComponent},
    {path:'chat',component:ChatComponent},
    {path:'users',component:UsersComponent}
];
