function Login(){
    let uname  = document.getElementById("uname").value;
    let pword = document.getElementById("pword").value;
    if(uname.match("^[A-Za-z]+$")===null)
        document.getElementById("err1").innerHTML = "Username must consist of alphabets only"
    else if(uname.length < 6 || uname.length > 10)
        document.getElementById("err1").innerHTML = "Username must be between 6 to 10 characters only"
    else
        (document.getElementById("err1").innerHTML = "")

    if(pword.length < 8)
        document.getElementById("err2").innerHTML = "Password should be greater than 8 characters"
    else if(pword.match("^[a-zA-Z0-9#]$")===null)
        document.getElementById("err2").innerHTML = "Password must contain a # and a number"
    else
        document.getElementById("err2").innerHTML = ""
}