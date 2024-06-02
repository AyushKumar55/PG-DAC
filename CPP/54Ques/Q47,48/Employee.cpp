
/*Construct a hierarchy of employees.
1. Create an Employee class with attributes like employee id, name, date of birth.
2. Inherit class WageEmployee from base class Employee
3. WageEmployee class should have following members
	a. Number of hours worked
	b. Rate per hour
4. SalesPerson class should have following members
	a. Number of items sold
	b. Commission per item
5. Write constructors for WageEmployee and SalesPerson  classes. 
6. Override the functions for displaying details, calculating salary in WageEmployee and SalesPerson class. 
	WageEmployee Salary = hours * rate
	SalesPerson Salary = hours*rate + sales*commission
*/

#include "Employee.h"

Employee::Employee(){
        emp_id = 0;
        emp_name = new char[50];
        dob = "1/1/1970";
    }

Employee::Employee(int id, const char* name, string date){
    emp_id=id;
    name = new char(strlen(name+1));
    strcpy(emp_name,name);
    dob = date;
}

void Employee::accept(){
    cout<<"Enter Employee Id: ";
    cin>>emp_id;
    cout<<"Enter Employee Name: ";
    cin.get();
    cin.getline(emp_name,50);
    cout<<"Enter date of birth - DD MM YYYY: ";
    getline(cin,dob);
}

void Employee::display(){
    cout<<"Emp_Id: "<<emp_id<<" Employee Name: "<<emp_name<<" Date of Birth: "<<dob<<endl;
}