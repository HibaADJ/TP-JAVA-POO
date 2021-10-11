const rayon = document.querySelector("#rayon");
const btnSubmit = document.querySelector("#btn-submit");
const formulaire = document.querySelector("#formulaire");
const diametre = document.querySelector("#diametre");
const circ = document.querySelector("#circ");
const aire = document.querySelector("#aire");
formulaire.addEventListener("submit", function () {
  diametre.value = rayon.value * 2;
  circ.value = 2 * 3.14 * rayon.value;
  aire.value = 3.14 * (rayon.value * rayon.value);
});
