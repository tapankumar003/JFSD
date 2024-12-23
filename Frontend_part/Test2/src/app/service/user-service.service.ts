import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class UserServiceService {

  constructor() { }

  users(){
    return(
      [
        {id:1, name:'user1', age:26},
        {id:2, name:'user2', age:27},
        {id:3, name:'user3', age:28}
      ]
    );
  }
}
