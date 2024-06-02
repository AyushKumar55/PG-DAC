#include<iostream>
#include<string>
#include "Employee.h"
using namespace std;

Employee::Employee(){
	cout<<"Default CTOR Called\n";
	emp_id = 0;
	emp_name = "";
	emp_salary = 0;
}

Employee::Employee(int id, string name, int salary){
	cout<<"Param CTOR Called\n";
	emp_id = id;
	emp_name = name;
	emp_salary = salary;
}

Employee::Employee(int s){
	size = s;
	data = new int[size];
}

Employee::Employee(Employee& src){
	cout<<"Copy CTOR Callled\n";
	this->size = src.size;
	this->data = new int[size];
	for(int i = 0; i < src.size; i++){
		this->data[i] = src.data[i];
	}
}

void Employee::display(){
	cout<<"Employee Id: "<<this->emp_id<<"	Employee Name: "
	<<this->emp_name<<"	Employee Salary: "<<this->emp_salary<<endl;
}

//Employee::~Employee(){
//	cout<<"\nDTOR called";
//	cout<<"\n Free up memory at "<<data;
//	delete [] data;
//}
