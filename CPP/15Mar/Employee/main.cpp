#include<iostream>
#include<string>
#include "Employee.h"
using namespace std;

int main(){
	
	Employee e1;
	e1.display();

	Employee e2(101, "Ayush", 50000);
	e2.display();

	Employee e3(2);
	Employee e4(e3);
	e3.display();

	cout<<"Program is going to exit\n";
	return 0;
}
