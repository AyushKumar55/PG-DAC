function Compute(){
    const amount = parseInt(document.getElementById("amount").value);
    const rate = parseInt(document.getElementById("rate").value);
    const time = parseInt(document.getElementById("time").value);

    if(amount < 0 || amount > 1500000)
        document.getElementById("err1").innerHTML = "Amount of Loan should not be more than 15 lakhs"
    else if(time < 7 || time > 15){
        document.getElementById("err1").innerHTML = ""
        document.getElementById("err2").innerHTML = "Repayment period should be between 7 yrs to 15 yrs"
    }
    else{
        document.getElementById("interest").value = ((amount * rate * time ) / 100).toFixed(2);
        document.getElementById("total").value = (amount + parseInt(document.getElementById("interest").value)).toFixed(2);
        document.getElementById("payment").value = (parseInt(document.getElementById("total").value) / (time * 12)).toFixed(2);
        document.getElementById("err1").innerHTML = ""
        document.getElementById("err2").innerHTML = ""
    }
}