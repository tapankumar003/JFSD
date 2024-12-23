import { Component, ElementRef, OnInit, ViewChild } from '@angular/core';
import { RouterLink } from '@angular/router';

@Component({
  selector: 'app-welcome',
  standalone: true,
  imports: [RouterLink],
  templateUrl: './welcome.component.html',
  styleUrl: './welcome.component.css'
})
export class WelcomeComponent implements OnInit{


  @ViewChild('name') nameKey!: ElementRef;

  ngOnInit(): void {
  }

  startQuiz(){
    localStorage.setItem("name",this.nameKey.nativeElement.value);
  }

}
