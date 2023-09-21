import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-card',
  templateUrl: './card.component.html',
  styleUrls: ['./card.component.css'],
})
export class CardComponent implements OnInit {
  produtos: string[] = [];
  menuType: string = 'superusers';
  constructor() {
    this.produtos = ['mause', 'teclado', 'tela', 'computador'];
  }


  ngOnInit(): void {}

  adicionar() {
    for (let index = 0; index < 5; index++) {
      this.produtos.push('Jailson');
    }
  }
  remove(index: number) {
    this.produtos.splice(index, 1);
  }
}
