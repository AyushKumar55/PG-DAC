const divs = document.querySelectorAll("div");
const matchingDivs = [];

for (const div of divs) {
  if (div.textContent.includes("training")) {
    matchingDivs.push(div);
  }
}

console.log(matchingDivs);