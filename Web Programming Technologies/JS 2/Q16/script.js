const webArr = ["www.google.com","www.msn.com","www.amazon.co.in","in.answers.yahoo.com","en.m.wikipedia.com","codehs.gitbooks.io","www.coderanch.com"];

let web = webArr.filter(a=>{
    return a.startsWith('www')
})

let str = `<ul>`
web.forEach(s=>{
    str += `<li><a href = "${s}">${s}</a></li>`
})

str+=`</ul>`

document.getElementById("div1").innerHTML = str+`<br> Total: ${web.length}`