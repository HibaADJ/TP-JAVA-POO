const tailleMatrice = parseInt(
  prompt("Veuillez entrer la taille de la matrice")
);

const matrice = [];
let somme1 = 0;
let somme2 = 0;
for (let i = 0; i < tailleMatrice; i++) {
  matrice[i] = [];
}

for (let i = 0; i < tailleMatrice; i++) {
  for (let j = 0; j < tailleMatrice; j++) {
    matrice[i][j] = parseInt(prompt("saisez les nombres de la matrice"));
  }
}

for (let i = 0; i < tailleMatrice; i++) {
  somme1 += matrice[i][i];
  somme2 += matrice[i][tailleMatrice - i - 1];
}
console.log(`La matrice est matrice = [ ${matrice}]`);
console.log(`sommme de la diagonale 1 est : ${somme1}`);
console.log(`sommme de la diagonale 2 est : ${somme2}`);
