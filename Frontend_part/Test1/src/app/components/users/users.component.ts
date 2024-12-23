import { Component } from '@angular/core';

@Component({
  selector: 'app-users',
  standalone: true,
  imports: [],
  templateUrl: './users.component.html',
  styleUrl: './users.component.css'
})
export class UsersComponent {

  users = [
    { id: 1, name: 'Alice', address: 'London' },
    { id: 2, name: 'Bob', address: 'Paris' },
    { id: 3, name: 'Charlie',address: 'Maimi' }
  ];

}
