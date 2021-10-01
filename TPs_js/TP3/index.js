const age = prompt("quel est l'age de l'enfant");
if (7 <= age && age <= 9) {
  alert(`Poussin`);
} else if (10 <= age && age <= 11) {
  alert(`Pupille`);
} else if (12 <= age && age <= 13) {
  alert(`Benjamin`);
} else if (15 <= age && age <= 15) {
  alert(`minime`);
} else if (16 <= age && age <= 17) {
  alert(`Cadet`);
} else {
  alert(`AUCUNE CATEGORIE`);
}
