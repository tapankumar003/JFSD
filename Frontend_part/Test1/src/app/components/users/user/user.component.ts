import { Component, input, OnInit } from '@angular/core';

@Component({
  selector: 'app-user',
  standalone: true,
  imports: [],
  templateUrl: './user.component.html',
  styleUrl: './user.component.css'
})
export class UserComponent implements OnInit{

  a = 5;
  b= 8;
  sum = this.a+this.b;

  m = "Hi boos, how are you!"
  
  constructor() {

  }

  ngOnInit(){
  }

  method1(){
    console.log("method1 called")
    return this.m;
  }

  method2(){
    alert("button was clicked");
  }

  animal="🐅";

  onKeyUp(keyUpEvent:any){
    console.log(keyUpEvent)
    keyUpEvent.key==='Enter' && alert("hiii");
  }

  // onInputChange(key:any){
  //   console.log(key)
  // }


}
