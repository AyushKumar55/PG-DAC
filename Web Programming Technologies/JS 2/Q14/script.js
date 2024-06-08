const rectangle = {
    dimension: {
        length: 10,
        breadth: 20,
    }, 
    area: function() {
        return this.dimension.length * this.dimension.breadth;
        },
    perimeter: function(){
        return 2*(this.dimension.length + this.dimension.breadth)
    }
}

const circle = {
    radius: 10,
    area: function() {
        return Math.PI * this.radius ** 2;
    },
    circumference: function(){
        return 2 * Math.PI * this.radius;
    }
}

function showRectangle(){
    document.getElementById("div1").innerHTML = `Length: ${rectangle.dimension.length} <br>
    Breadth: ${rectangle.dimension.breadth} <br>
    Area: ${rectangle.area().toFixed(2)} <br> Perimeter: ${rectangle.perimeter().toFixed(2)}`
}

function showCircle(){
    document.getElementById("div1").innerHTML = `Radius: ${circle.radius} <br>
    Area: ${circle.area().toFixed(2)} <br> Circumference: ${circle.circumference().toFixed(2)}`
}

