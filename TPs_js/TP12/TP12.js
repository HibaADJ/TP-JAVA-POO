const nbreDescases = parseInt(prompt("donner nbre de case"));
const tb = [];
let sum = 0;
for (let c = 0; c < nbreDescases; c++) {
  tb[c] = prompt(" remplir le tableau ");
}
for (let i = 0; i < tb.length; i++) {
  sum += parseInt(tb[i]);
}

console.log(`somme de tableau : ${sum}`);
