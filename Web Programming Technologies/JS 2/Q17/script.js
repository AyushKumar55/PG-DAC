function display(){
    var radius = parseInt(document.getElementById("radius").value);
    const area = (Math.PI * Math.pow(radius,2)).toFixed(2)
    const circum = (2 * Math.PI * radius).toFixed(2)
    document.getElementById("div1").innerHTML = `Area: ${area}<br><br>Circumference: ${circum}` 
}