//Employee.h
#include<string>
using namespace std;
class Employee{

	int emp_id;
	string emp_name;
	int emp_salary;
	int *data;
	int size;

public:
	Employee();
	Employee(int, string, int);
	Employee(int);
	Employee(Employee& src);
	void display();
};
	
