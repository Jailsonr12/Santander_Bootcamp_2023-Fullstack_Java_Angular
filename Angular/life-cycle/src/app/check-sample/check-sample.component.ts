import {
  Component,
  OnInit,
  DoCheck,
  AfterContentChecked,
  AfterContentInit,
  AfterViewChecked,
  AfterViewInit,
  OnDestroy,
  Output,
} from '@angular/core';

@Component({
  selector: 'app-check-sample',
  templateUrl: './check-sample.component.html',
  styleUrls: ['./check-sample.component.css'],
})
export class CheckSampleComponent
  implements
    OnInit,
    DoCheck,
    AfterContentChecked,
    AfterContentInit,
    AfterViewChecked,
    AfterViewInit,
    OnDestroy
{
  quantidade: number = 0;
  constructor() {}

  adicionar() {
    this.quantidade += 1;
  }

  decrementar() {
    this.quantidade -= 1;
  }

  //CHECKED -> content -> view

  //quando o primeiro conteudo é iniciado
  ngAfterContentInit(): void {
    console.log(`AfterContentInit ->` + this.quantidade);
  }

  //depois da inicialização do view
  ngAfterViewInit(): void {
    console.log(`ngAfterViewInit ->` + this.quantidade);
  }

  //após alguma alteração verifica algum conteudo
  ngAfterContentChecked(): void {
    console.log(`AfterContentChecked ->` + this.quantidade);
  }

  //após alguma alteração verifica algum view
  ngAfterViewChecked(): void {
    console.log(`AfterViewChecked ->` + this.quantidade);
  }

  //depois do ngInit
  ngDoCheck(): void {
    console.log(`oCheck ->` + this.quantidade);
  }

  ngOnInit(): void {
    console.log(`ngOnInit ->` + this.quantidade);
  }

  ngOnDestroy(): void {
    console.log('_-_-_-_-_-_goodbye my friend_-_-_-_-_-_');
  }
}
