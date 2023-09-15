//  type heroi = {
//     name: string;
//      vulgo: string;
//  }
//  function printaObj(pessoa:heroi){
//  console.log(pessoa)
//  }
//  printaObj({
//      name: "bruce way",
//      vulgo: "batman",
//  })
//  console.log("ola mundo")
//
//  tipos primitivos: boolean, number, string
// let ligado: boolean = false;
// let nome: string = "Jailson";
// let number: number = 1.2;
// let idade: number = 23;

//  Tipos especial: null undefined;
// let nulo: null = null;
// let indefinido: undefined = undefined;

//  tipo  abrangente: any, void
// let retorno: void; // VAZIO
// let retornoView: any = 312231; // qualquer coisa

//  Object - sem previsibilidade ( sem tipagem)
// let porduto: object = {
//   name: "jailson",
//   cidade: "Blumenau",
//   idade: 30,
// };

//  Object Tipado
// type ProdutoLoja = {
//   preço: number;
//   nome: string;
//   unidades: number;
//   tem: boolean;
// };
// let meuProduto: ProdutoLoja = {
//   nome: "Carro",
//   preço: 13.9,
//   tem: true,
//   unidades: 4,
// };

//  Arrzy
// let dados: string[] = ["Jailson", "Ana", "NOelci", "Dilson"];
// let dados2: Array<string> = ["Jailson", "Ana", "NOelci", "Dilson"];
// let infos: (string | number)[] = ["Jailso", 23];

//  Tuplas
// let boleto: [String, number, number] = ["agua conta", 45.9, 321418];

//  Data
// let aniverario:Date = new Date("2022-12-01 05:00")

// função
// function addNumber(x: number, y: number): number {
//   return x + y;
// }
// let soma: number = addNumber(3, 5);
// function callToPhone(phone: number | string) {
//   return phone;
// }
// console.log(callToPhone("421312321"));
// callToPhone(421312321);

// // função async
// async function getDataBase(id: number): Promise<number | string> {
//   return "Jailson";
// }

//Interface (type x interface)
// type robot = {
//     readonly id: number | string;
//     name: string;
// };
// const bot: robot = {
//     id: 1,
//     name: "jailson",
// };
// Interface robot2 {
//     readonly id: number | string;
//     name: string;
//     sayHello(): string;
// }
// const bot2: robot2 = {
//     id: "32",
//     name: "jailson",
//     sayHello: function (): string {
//         return "hello";
//     },
// };
// class Pessoa implements robot2 {
//     id: string | number;
//     name: string;
//     constructor(id: string | number, name: string) {
//         this.id = id;
//         this.name = name;
//     }
//     sayHello(): string {
//         return `hello i'm ${this.name}`;
//     }
// }
// const p = new Pessoa(1, "jailson");
// console.log(p.sayHello());

// Data modifiers: public, privatem, protect
// Classes (superclass)
// class Character {
//   private name?: string;
//   stregth: number;
//   skill: number;
//   constructor(name: string, stregth: number, skill: number) {
//     this.name = name;
//     this.stregth = stregth;
//     this.skill = skill;
//   }
//   attack(): void {
//     console.log(`Attack with ${this.stregth} points`);
//   }
// }
// // subClasse (filha da superclasss)
// class Magician extends Character {
//   magicPoints: number;
//   constructor(
//     name: string,
//     stregth: number,
//     skill: number,
//     magicPoints: number
//   ) {
//     super(name, stregth, skill);
//     this.magicPoints = magicPoints;
//   }
// }
// const p1 = new Character("jaja", 10, 99);
// const mago = new Magician("mamago", 10, 32, 50);
// console.log("mago", mago.magicPoints);
// console.log(p1);
// p1.attack();

// GENERICS
// function concatArray<T>(...itens: T[]): T[] {
//   return new Array().concat(...itens).sort();
// }
// const numArray = concatArray<number[]>([6, 1, 2], [5]);
// console.log(numArray);
// const stgArray = concatArray<string[]>(["Jailson", "Goku"], ["Naruto"]);
// console.log(stgArray);
// let dados: string = "Jailson"
// console.log("dads", dados);

// DECORATORS

// function ExibirNome(target:any){
//     console.log(target);
// }

// @ExibirNome
// class Funcionario {}
// @ExibirNome
// class Quincas{}

//DECORATORS UTIL

// function apiVersion(version: string) {
//   return (target: any) => {
//     Object.assign(target.prototype, { __version: version, __name: "jailson" });
//   };
// }

// @apiVersion("1.10")
// class Api{}

// const api  = new Api();

// console.log(api.__version)
// console.log(api.__name)

// Atributo decorators

// function minLength(lenght: number) {
//   return (target: any, key: string) => {
//     let _value = target[key];

//     const getter = () => "[play] " + _value;
//     const setter = (value: string) => {
//       if (value.length < lenght) {
//         throw new Error(`Tamanho menos do que ${lenght}.`);
//       } else {
//         _value = value;
//       }
//     };

//     Object.defineProperty(target, key, {
//       get: getter,
//       set: setter,
//     });
//   };
// }

// class Api {
//   @minLength(10)
//   name: string;

//   constructor(name: string) {
//     this.name = name;
//   }
// }

// const api = new Api("j3213123a33");
// console.log(api.name);
