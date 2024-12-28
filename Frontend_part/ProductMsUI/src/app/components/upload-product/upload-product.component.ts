import { Component, OnInit } from '@angular/core';
import { Product } from '../../product';
import { ProductServiceService } from '../../service/product-service.service';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

@Component({
  selector: 'app-upload-product',
  standalone: true,
  imports: [FormsModule,HttpClientModule],
  templateUrl: './upload-product.component.html',
  styleUrl: './upload-product.component.css',
  providers:[ProductServiceService]
})
export class UploadProductComponent implements OnInit{

  constructor(private pservice:ProductServiceService){

  }

  productList:any =[];

  ngOnInit(): void {
    this.getAllProducts();
  }

  product: Product={
    id:0,
    productName:''
  }

  productUpload(data:any){
    this.product=data;
    this.pservice.addProduct(this.product).subscribe(
      // res=>{
      //   if(res==null){
      //     alert("sorry");
      //   }
      //   else{
      //     alert("successfully updated");
      //   }
      // }

    )
    alert("Update successfully!")

  }

  getAllProducts(){
    this.pservice.getAllProduct().subscribe(res=>{
      this.productList=res;
    })
  }

}
