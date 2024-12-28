import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { UploadProductComponent } from './components/upload-product/upload-product.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet,UploadProductComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'ProductMsUI';
}
