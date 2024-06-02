#include<iostream>
#include<string>
#include "Employee.h"
using namespace std;

int main(){
	
	Employee e1;
	e1.display();

	Employee e2(101, "Ayush", 50000);
	e2.display();

	Employee *eptr1 = new Employee(102, "Yassar", 60000);
	eptr1->display();
	delete eptr1;
	
	int n;
	cout<<"Enter the Employee count\n";
	cin>>n;

	Employee e[n];
	for(int i=0; i<n; i++){
		e[i].accept();
	}
	for(int i=0; i<n; i++){
		e[i].display();
	}
	Employee::printCount();

	return 0;
}
