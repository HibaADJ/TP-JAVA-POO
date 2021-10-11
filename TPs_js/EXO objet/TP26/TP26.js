const nomInput = document.querySelector("#nom");
const prenomInput = document.querySelector("#prenom");
const ageInput = document.querySelector("#age");
const genreInput = document.querySelector("#genre");
const paysInput = document.querySelector("#pays");
const optionInput = document.querySelector("#option");
const listeCoursInput = document.querySelector("#listeCours");

const formulaire = document.querySelector("#formulaire");
const etudiants = document.querySelector("#etudiants");
const erreur = document.querySelector("#erreur");

const tableauEtudiants = [];

function EtudiantsRemplir(
  nom,
  prenom,
  age,
  genre,
  pays,
  option,
  listeDesCours
) {
  this.nom = nom;
  this.prenom = prenom;
  this.age = age;
  this.genre = genre;
  this.pays = pays;
  this.option = option;
  this.listeDesCours = listeDesCours;
}

formulaire.addEventListener("submit", function (e) {
  e.preventDefault();
  // ce tableau nous sert à tester si les valeurs sont valide ou nn
  const tabTest = [
    nomInput.value,
    prenomInput.value,
    ageInput.value,
    genreInput.value,
    paysInput.value,
    optionInput.value,
    listeCoursInput.value,
  ];

  // la methode some retourne vrai si au moins un seul champ a une taille vide
  let valid = tabTest.some(function (input) {
    return input.length === 0;
  });

  if (valid) {
    erreur.innerText = "tout les champs doit être remplie";
  } else {
    erreur.innerText = "";

    const tr = document.createElement("tr");

    const nom = document.createElement("td");
    nom.innerText = nomInput.value;

    const prenom = document.createElement("td");
    prenom.innerText = prenomInput.value;

    const age = document.createElement("td");
    age.innerText = ageInput.value;

    const genre = document.createElement("td");
    genre.innerText = genreInput.value;

    const pays = document.createElement("td");
    pays.innerText = paysInput.value;

    const option = document.createElement("td");
    option.innerText = optionInput.value;

    const listeDesCours = document.createElement("td");
    listeDesCours.innerText = listeCoursInput.value;

    etudiants.append(tr);
    tr.append(nom, prenom, age, genre, pays, option, listeDesCours);

    const newEtudiant = new EtudiantsRemplir(
      nomInput.value,
      prenomInput.value,
      ageInput.value,
      genreInput.value,
      paysInput.value,
      optionInput.value,
      listeCoursInput.value
    );
    tableauEtudiants.push(newEtudiant);
    console.log(tableauEtudiants);
  }
  // }

  // ici nous permet de verifier si le champ et remplie ou non et sinon si on remplie le formulaire et on vide le champs
  // if (!nomInput.value) {
  //   erreur.innerText = "Ce champ doit être remplie";
  // } else {
  //   nomInput.value = "";
  //   erreur.innerText = "";
  // }
  // if (!prenomInput.value) {
  //   erreur.innerText = "Ce champ doit être remplie";
  // } else {
  //   prenomInput.value = "";
  //   erreur.innerText = "";
  // }
  // if (!ageInput.value) {
  //   erreur.innerText = "Ce champ doit être remplie";
  // } else {
  //   ageInput.value = "";
  //   erreur.innerText = "";
  // }
  // if (!genreInput.value) {
  //   erreur.innerText = "Ce champ doit être remplie";
  // } else {
  //   genreInput.value = "";
  //   erreur.innerText = "";
  // }
  // if (!paysInput.value) {
  //   erreur.innerText = "Ce champ doit être remplie";
  // } else {
  //   paysInput.value = "";
  //   erreur.innerText = "";
  // }
  // if (!optionInput.value) {
  //   erreur.innerText = "Ce champ doit être remplie";
  // } else {
  //   optionInput.value = "";
  //   erreur.innerText = "";
  // }
  // if (!listeCoursInput.value) {
  //   erreur.innerText = "Ce champ doit être remplie";
  // } else {
  //   listeCoursInput.value = "";
  //   erreur.innerText = "";
  // }
});
