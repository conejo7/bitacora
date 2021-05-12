import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from "@angular/forms";
import { AudImagenService } from './services/audimagen/aud-imagen.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title = 'frontend';

  audimagenForm: FormGroup;
  audimagenes: any;

  constructor(
    public fb: FormBuilder,
    public audImagenService: AudImagenService,

  ) {

  }
  ngOnInit(): void {
    this.audimagenForm = this.fb.group({
      id : ['',Validators.required],
      area : ['',Validators.required],
      codigo : ['',Validators.required],
      estadoD : ['',Validators.required],
      estadoU : ['',Validators.required],
      estadoinformes : ['',Validators.required],
      fecIni : ['',Validators.required],
      fecUpd : ['',Validators.required],
      firstUser : ['',Validators.required],
      historia : ['',Validators.required],
      lastUser : ['',Validators.required],
      lkImg : ['',Validators.required],
      lkInf : ['',Validators.required],
      lockReg : ['',Validators.required],
      orden : ['',Validators.required],
      practica : ['',Validators.required],
      validado : ['',Validators.required],

    });;
   
    this.audImagenService.getAllaudImagen().subscribe(resp=>{
      this.audimagenes = resp;
      console.log(resp);
    },
    error=> { console.error(error)}
      
    
    )

    
  }

  guardar():void{

  }


}
