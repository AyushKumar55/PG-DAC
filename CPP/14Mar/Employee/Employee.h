#ifndef EMPLOYEE_H
#define EMPLOYEE_H

#include<string>
using namespace std;

class Employee{

	int emp_id;
	string emp_name;
	int emp_salary;

public:
	Employee();
	void accept();
	void display();
	int getSalary();
};
	
#endif
