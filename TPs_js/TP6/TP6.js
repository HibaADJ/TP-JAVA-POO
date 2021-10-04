const c = 2;
do {
  var a = prompt("Entrer un nombre entre 1 et 3");
  if (a == c) {
    alert(`BRAVO`);
    break;
  } else if (a > c) {
    alert("un peu moin");
  } else if (a < c) {
    alert("un peu plus");
  }
} while (a != c);
