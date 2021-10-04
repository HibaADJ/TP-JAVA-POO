let nbrInitial = parseInt(prompt("donner un nbre initial"));
let nbrFinal = parseInt(prompt("donner un nbre Final"));
let nbrDebut = parseInt(prompt("donner un nbre debut"));
let nbrArrive = parseInt(prompt("donner un nbre arrive"));

for (let i = nbrInitial; i <= nbrFinal; i++) {
  for (j = nbrDebut; j <= nbrArrive; j++) {
    let mult = parseInt(i * j);
    console.log(`${i} * ${j} =${mult}`);
  }
}
