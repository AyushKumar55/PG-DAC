function sumDigits(num){
    let sum = 0;
    while(num != 0){
        sum = sum + Math.trunc(num % 10);
        num = Math.trunc(num/10);
    }
    return sum;
} 

function result(){
    const num = parseInt(document.getElementById("num").value);
    if (num > 0 && num < 1000){ 
        document.getElementById("error").innerHTML = "";
        document.getElementById("div1").innerHTML = `Sum of the digits of ${num} is ${sumDigits(num)}`
    }
    else{
        document.getElementById("div1").innerHTML = ""
        document.getElementById("error").innerHTML = "Entered number is out of range"
    }
}