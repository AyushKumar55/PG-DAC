#include <iostream>
#include<string.h>
using namespace std;

class EmpCC 
{
private:
	int empId;
	string empName;
	int* empSalary;

public:
	EmpCC() // Constructor
	{
		empSalary = new int;
	}

	
	void setValue(int id, string name, int salary) // Function to set details of Employee
	{
		empId = id;
		empName = name;
		*empSalary = salary;
	}

	void display()  // Function to display details
	{
		cout << " Employee ID = " << empId
			<< "\n Employee Name = " << empName
			<< "\n Employee Salary = " << *empSalary
			<< endl;
	}

	EmpCC(EmpCC& sample)  // Parameteric Constructor
		{
		empId = sample.empId;
	    empName = sample.empName;
        empSalary = new int;
		*empSalary = *(sample.empSalary);
	}

	~EmpCC()  // Destructor
	{   
        cout<<"\n Destructor Called";
		cout<<"\n Free up memory at "<<empSalary;
		delete empSalary;
	}
};

int main()
{
	EmpCC first;
	first.setValue(001, "Yassar", 50000);
	first.display();
	EmpCC second = first;
	second.display();
	return 0;
}