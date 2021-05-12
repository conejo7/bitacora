import { Injectable } from '@angular/core';
import { Observable } from "rxjs";
import { HttpClient, HttpClientModule } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class AudImagenService {

  private API_SERVER = "http://localhost:8080/";

  constructor(
  
    private httpClient:HttpClient

  ) { 
    console.log("servicio listo");
  }

  public getAllaudImagen(): Observable<any>{
    return this.httpClient.get(this.API_SERVER);
  }


}
