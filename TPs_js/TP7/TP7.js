const c = 15;
do {
  var a = prompt("Entrer un nombre entre 10 et 20");
  if (a == c) {
    alert(`BRAVO`);
    break;
  } else if (a > c) {
    alert("un peu moin");
  } else if (a < c) {
    alert("un peu plus");
  }
} while (a != c);
