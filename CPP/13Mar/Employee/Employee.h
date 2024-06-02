//employee.h
#include<string>
using namespace std;
class Employee{

	int emp_id;
	string emp_name;
	int emp_salary;
	static int count;

public:
	Employee();
	Employee(int, string, int);
	void accept();
	void display();
	static void printCount();
};
	
