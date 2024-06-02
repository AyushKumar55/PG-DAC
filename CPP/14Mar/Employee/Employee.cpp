#include<iostream>
#include "Employee.h"
#include "Employee.h"
using namespace std;

Employee::Employee(){
	//cout<<"Default CTOR Called\n";
	//count++;
	emp_id = 0;
	emp_name = "";
	emp_salary = 0;
}

/*
Employee::Employee(int id, string name, int salary){
	cout<<"Param CTOR Called\n";
	count++;
	emp_id = id;
	emp_name = name;
	emp_salary = salary;
}
*/

void Employee::accept(){
	cout<<"Enter Employee Id\n";	
	cin>>emp_id;
	cout<<"Enter Employee Name\n";
	cin.get();
	getline(cin,emp_name);
	cout<<"Enter Employee Salary\n";
	cin>>emp_salary;
}

void Employee::display(){
	cout<<"Employee Id: "<<this->emp_id<<"	Employee Name: "
	<<this->emp_name<<"	Employee Salary: "<<this->emp_salary<<endl;
}

int Employee::getSalary(){
	return emp_salary;
}
