import { Component, OnInit } from '@angular/core';
import { QuestionService } from '../service/question.service';
import { HttpClientModule } from '@angular/common/http';
import { interval } from 'rxjs';

@Component({
  selector: 'app-question',
  standalone: true,
  imports: [HttpClientModule],
  templateUrl: './question.component.html',
  styleUrl: './question.component.css',
  providers:[QuestionService]
})
export class QuestionComponent implements OnInit{

  public name:any;
  public questionList:any=[];
  public currentQuestion:any = 0;
  public points:number=0;
  public counter = 60;
  public correctAnswer:number=0;
  public inCorrectAnswer:number=0;
  interval$:any;
  progress:string="width:0%";
  isQuizCompleted : boolean =false;

  constructor(private questionService : QuestionService){

  }

  ngOnInit(): void {
    this.name=localStorage.getItem("name")!;
    this.getAllQuestions();
    this.startCounter();
  }
  getAllQuestions(){
    this.questionService.getQuestionJson().subscribe(res=>{
    this.questionList = res.questions;  
    })
  }

  nextQuestion(){
    this.currentQuestion++;
  }

  prviousQuestion(){
    this.currentQuestion--;
  }

  answer(currentQno:number, option:any){
    if(currentQno==this.questionList.length)
      {
        this.isQuizCompleted= true;
        this.stopCounter();
      }
    if(option.correct){
      this.points +=10;
      this.correctAnswer++;
      this.currentQuestion++;
      this.resetCounter();
      this.getProgressPerchant();
    }
    else{
      this.inCorrectAnswer++;
      this.currentQuestion++;
      this.resetCounter();
      this.getProgressPerchant();

      this.points -=10;
    }
  }

  startCounter()
  {
    this.interval$ =interval(1000)
    .subscribe(val=>{
      this.counter--;
      if(this.counter===0)
      {
        this.currentQuestion++;
        this.counter=60;
        this.points-=10;
      }
    });

    setTimeout(()=>{
      this.interval$.unsubscribe();
    },600000);
  }

  stopCounter()
  {
    this.interval$.unsubscribe();
    this.counter=0;
  }

  resetCounter()
  {
    this.stopCounter();
    this.counter=60;
    this.startCounter();
  }

  resetQuiz()
  {
    this.resetCounter();
    this.getAllQuestions();
    this.points=0;
    this.counter=60;
    this.currentQuestion=0;
    this.progress="width:0%";
  }

  getProgressPerchant()
  {
    this.progress =((this.currentQuestion/this.questionList.length)*100).toString();
    this.progress='width:'+this.progress+'%';
    return this.progress;
  }


}