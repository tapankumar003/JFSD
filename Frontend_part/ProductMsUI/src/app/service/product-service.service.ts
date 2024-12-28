import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Product } from '../product';

@Injectable({
  providedIn: 'root'
})
export class ProductServiceService {

  baseUrl= "http://localhost:8080/product"

  constructor(private http:HttpClient) { }

  addProduct(productData: Product){
    console.log("service"+productData);
    return this.http.post(this.baseUrl+"/add",productData);
  }

  getAllProduct(){
    return this.http.get(this.baseUrl);
  }


}
