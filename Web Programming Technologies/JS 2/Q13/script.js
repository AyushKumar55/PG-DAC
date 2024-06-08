class Employee{
    constructor(id, name, salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}

const employees = [
new Employee(1, 'John Doe', 50000),
new Employee(2, 'Jane Doe', 60000),
new Employee(3, 'Mike Doe', 55000),
new Employee(4, 'Sara Doe', 65000)
];

function displayEmp(){
    var str = 
    `<table border="1">
        <thead>
            <tr>
            <th>Employee Id</th>
            <th>Employee Name</th>
            <th>Employee Salary</th>
            </tr>
        </thead>
        <tbody>`;
    for(const e of employees){
        str+= 
        `<tr>
            <td>${e.id}</td>
            <td>${e.name}</td>
            <td>${e.salary}</td>
        </tr>`
    }
    str += 
    `</tbody>
    </table>`;
    document.getElementById("div1").innerHTML = str;
}