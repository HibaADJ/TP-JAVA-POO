const nbreDescases = parseInt(prompt("donner nbre de case"));
const tb1 = [];
const tb2 = [];
const somme = [];
for (let c = 0; c < nbreDescases; c++) {
  tb1[c] = parseInt(prompt(" remplir le tableau 1 "));
  console.log(`tableau 1: ${tb1[c]}`);
}
for (let c = 0; c < nbreDescases; c++) {
  tb2[c] = parseInt(prompt(" remplir le tableau 2 "));
  console.log(`tableau 2: ${tb2[c]}`);
}
for (let c = 0; c < nbreDescases; c++) {
  somme[c] = tb1[c] + tb2[c];
  console.log(`tableau somme: ${somme[c]}`);
}
