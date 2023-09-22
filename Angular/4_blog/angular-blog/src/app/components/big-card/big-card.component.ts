import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-big-card',
  templateUrl: './big-card.component.html',
  styleUrls: ['./big-card.component.css'],
})
export class BigCardComponent implements OnInit {
  @Input()
  photoCover: string = ''; //https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEgGxVS04wVZ7Wrerbk-oBGs2I1Ymz2u3t-XoQZ7XDIBUSFNGmfy1YQbqwNetxydDF_3eW5BlQz7RlqJ7RacwzVKg_r4mgql9H9exLsJzhxnvVuQ2Jg1q42WK1YpHBuQITQk6ds3zEqpM-iV2R1DdsXW2v76kMsiUUAr3wksovlAXzUyXdmIxP9tdpdA7lo/s2048/jujutsu-kaisen-fas-lamentam-a-morte-de-um-amado-personagem-2.jpg
  @Input()
  cardTitle: string = ''; //Como conseguir ter meia entrada no cinema
  @Input()
  cardDescription: string = ''; //  Segundo o grande mestre Saturgojo do anime e manga Jujutsu Kaisen, você so
  // precisa ter uma amizade verdadeira com o Sukuna...

  constructor() {}

  ngOnInit(): void {}
}
