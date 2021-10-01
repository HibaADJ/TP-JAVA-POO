const adresse = prompt("veuillez saisir votre adresse mail");
const mdp = prompt("choisissez un mots de passe");
let nbrcnx = 0;
do {
  var adresse_c = prompt("entrer votre adresse");
  var mdp_c = prompt("choisissez un mots de passe");
  nbrcnx++;
  if (adresse == adresse_c && mdp == mdp_c) {
    alert("bienvenue dans votre compte");
  } else {
    alert("resseyer");
  }
  if (nbrcnx == 5) {
    alert("vous venez d'eessyer 5 fois, votre compte est bloqué");
    break;
  }
} while (adresse != adresse_c || mdp != mdp_c);
