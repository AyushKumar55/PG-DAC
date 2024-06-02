#include<iostream>
#include "Employee.h"
#include "Util.h"
using namespace std;

int main(){
	
	Employee e1;
	
	int n;
	cout<<"Enter the Employee count\n";
	cin>>n;

	Employee e[n];
	for(int i=0; i<n; i++){
		e[i].accept();
	}
	
	sortBySalary(e,n);
	
	for(int i=0; i<n; i++){
		e[i].display();
	}
	
	return 0;
}
