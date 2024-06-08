let names = ["ayush", "sourav", "anirudh", "prashant", "soham"]
document.write("Names: "+names+"<br>")

names.forEach((e) => {
    let e1 = e.split("").reverse().join("");
    names.splice(names.indexOf(e), 1, e1);
})
names.sort((a,b)=>{
    return a.localeCompare(b)
});

document.write("Names after Reversing: "+names+"<br>");
