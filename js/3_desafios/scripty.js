// //Desafios JavaScript na DIO têm funções "gets" e "print" acessíveis globalmente:
// //- "gets" : lê UMA linha com dado(s) de entrada (inputs) do usuário;
// //- "print": imprime um texto de saída (output), pulando linha.const ativos = [];

// // Entrada da quantidade de ativos
// const quantidadeAtivos = parseInt(gets());

// //Entrada dos tipos de ativos
// const ativos = [ ];
// for (let i = 0; i < quantidadeAtivos; i++) {
//   const codigoAtivo = gets();
//   ativos.push(codigoAtivo);
// }

// //TODO: Ordenar os ativos em ordem alfabética.
// let ordernar = ativos.sort() 
// //TODO: Imprimir a lista de ativos ordenada, conforme a tabela de exemplos.
// for (let i = 0; i < ordernar.length; i++) {
//   print(ordernar);
// }
valorInvertido = 5000
juros = 0.08
periodo = 5

for (let i = 0; i < periodo; i++) {
    valorInvertido = (valorInvertido + (valorInvertido * juros))
    console.log(valorInvertido.toFixed(2));

}
