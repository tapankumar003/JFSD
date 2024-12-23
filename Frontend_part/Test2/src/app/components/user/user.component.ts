import { Component, OnInit } from '@angular/core';
import { UserServiceService } from '../../service/user-service.service';

@Component({
  selector: 'app-user',
  standalone: true,
  imports: [],
  templateUrl: './user.component.html',
  styleUrl: './user.component.css'
})
export class UserComponent implements OnInit{
  
  usr:any;
  constructor(private userdata:UserServiceService){
    this.usr = userdata.users();
  }

  ngOnInit(): void {
    
  }


}
