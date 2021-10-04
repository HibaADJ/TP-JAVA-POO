let nbr = parseInt(prompt("DONNER UN NBRE"));

for (let i = 1; i <= nbr; i++) {
  if (i % 3 == 0 && i % 5 == 0) {
    console.log("FIZZBUZ");
  } else if (i % 5 == 0) {
    console.log("BUZZ");
  } else if (i % 3 == 0) {
    console.log("FIZZ");
  } else {
    console.log(i);
  }
}
