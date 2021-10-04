function InscriptionEtudiant(
  nom,
  prenom,
  age,
  genre,
  pays,
  option,
  listeCours
) {
  (this.nom = nom),
    (this.prenom = prenom),
    (this.age = age),
    (this.genre = genre),
    (this.pays = pays),
    (this.option = option),
    (this.listeCours = listeCours);
}

const etudiants = [];
const nombreEtudiant = parseInt(prompt("Entre le nombre d'étudiant"));

for (let i = 1; i <= nombreEtudiant; i++) {
  const nom = prompt("Entre le nom");
  const prenom = prompt("Entre le prenom");
  const age = prompt("Entre l'age");
  const genre = prompt("Entre le genre ");
  const pays = prompt("Entre le pays");
  const option = prompt("Entre une option");
  //   const listeCours = ["math", "anglais", "etc"];
  const nbreCours = prompt("Nombre de cours :");

  const listeCours = [];

  for (let i = 0; i < nbreCours; i++) {
    listeCours.push(prompt("Entrez les cours"));
  }
  const etudiant = new InscriptionEtudiant(
    nom,
    prenom,
    age,
    genre,
    pays,
    option,
    listeCours
  );
  etudiants.push(etudiant);
}

for (let i = 0; i <= etudiants.length; i++) {
  console.log(etudiants[i]);
}

InscriptionEtudiant.prototype.changeLeNom = function (nouveauNom) {
  return (this.nom = nouveauNom);
};
InscriptionEtudiant.prototype.changeLePrenom = function (nouveauPrenom) {
  return (this.prenom = nouveauPrenom);
};
InscriptionEtudiant.prototype.changeOption = function (changeOption) {
  return (this.option = changeOption);
};

const russes = [];

for (let i = 0; i < etudiants.length; i++) {
  if (etudiants[i].pays === "Russie") {
    russes.push(etudiants[i]);
  }
}

let nbChinoise = 0;
for (let i = 0; i < etudiants.length; i++) {
  if (etudiants[i].pays === "Chine" && etudiants[i].genre === "F") {
    nbChinoise++;
  }
}

const nomAAffiche = [];
for (let i = 0; i < etudiants.length; i++) {
  nomAAffiche.push(etudiants[i].nom);
}

const nomFiniA = [];
for (let i = 0; i < etudiants.length; i++) {
  if (etudiants[i].nom[etudiants[i].nom.length - 1] === "a") {
    nomFiniA.push(etudiants[i]);
  }
}

const nomCommenceKEtFemme = [];
for (let i = 0; i < etudiants.length; i++) {
  if (etudiants[i].nom[0] === "k" && etudiants[i].genre === "F") {
    nomCommenceKEtFemme.push(etudiants[i]);
  }
}

const nomCommenceMEtHomme = [];
for (let i = 0; i < etudiants.length; i++) {
  if (etudiants[i].nom[0] === "M" && etudiants[i].genre === "H") {
    nomCommenceMEtHomme.push(etudiants[i]);
  }
}