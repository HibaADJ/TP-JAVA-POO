const tailleMatrice = parseInt(
  prompt("Veuillez entrer la taille de la matrice")
);

const matrice = [];
let somme = 0;

for (let i = 0; i < tailleMatrice; i++) {
  matrice[i] = [];
}

for (let i = 0; i < tailleMatrice; i++) {
  for (let j = 0; j < tailleMatrice; j++) {
    matrice[i][j] = parseInt(prompt("saisez les nombres de la matrice"));
  }
}

for (let i = 0; i < tailleMatrice; i++) {
  somme += matrice[i][i];
}
console.log(`La matrice est matrice = [ ${matrice}]`);
console.log(`sommme de la diagonale est : ${somme}`);
