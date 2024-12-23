import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-hello',
  standalone: true,
  imports: [],
  templateUrl: './hello.component.html',
  styleUrl: './hello.component.css'
})
export class HelloComponent implements OnInit{
  // @Input() name:any;

  constructor(){}
  ngOnInit(): void {
    
  }


}
