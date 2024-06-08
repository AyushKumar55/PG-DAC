function display(){
    const oid = parseInt(document.getElementById("oid").value);
    const name = document.getElementById("cname").value;
    let billdate = new Date(document.getElementById("billdate").value);
    let shipdate = new Date(document.getElementById("shipdate").value);
    const total = parseFloat(document.getElementById("total").value).toFixed(2);
    console.log(billdate.getDate())

    if(name.trim().length<6)
        document.getElementById("err1").innerHTML = "Cust name cannot be < 6 characters"
    else if(billdate.valueOf() > shipdate.valueOf()){
        document.getElementById("err1").innerHTML= ""
        document.getElementById("err2").innerHTML = "Billing date cannot be greater than shipping date"
    }
    else{
        document.getElementById("err1").innerHTML = ""
        document.getElementById("err2").innerHTML = ""
        const options = {year: 'numeric', month: '2-digit', day: '2-digit'}
        billdate = billdate.toLocaleDateString('en-US', options)
        shipdate = shipdate.toLocaleDateString('en-US', options)
        let Order = {
            Order_Id: oid,
            Cust_Name: name,
            Billdate: billdate,
            Shipdate: shipdate,
            Total: total
        }
        let str = ""
        str = `Order Id: ${Order.Order_Id}<br>
                Cust_name: ${Order.Cust_Name}<br>
                Bill Date: ${Order.Billdate}<br>
                Ship Date: ${Order.Shipdate}<br>
                Total: ${Order.Total}`
        window.open().document.write(`<h2>Order Details: </h2><h3>${str}</h3>`)
    }
}