import { HttpClient } from "@angular/common/http";
import { environment } from "../../environment/environment";
import { Product } from "../models/product.model";
import { Injectable } from "@angular/core";
import { Observable } from "rxjs";

@Injectable({
    providedIn: 'root'
})

export class ProductService {
    private apiUrl: string = `${environment.baseUrl}/product`;

    constructor(private http: HttpClient) {}

    getAllProducts(): Observable<Product[]> {
        return this.http.get<Product[]>(this.apiUrl);
    }
}