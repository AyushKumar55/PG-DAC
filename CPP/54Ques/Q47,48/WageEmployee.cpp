#include "WageEmployee.h"

WageEmployee::WageEmployee(){
    noOfHours = 0;
    rate = 0.0;
}

WageEmployee::WageEmployee(int h, double r){
    noOfHours = h;
    rate = r;
}

void WageEmployee::accept(){
    Employee::accept();
    cout<<"Enter Total Working Hours: ";
    cin>>noOfHours;
    cout<<"Enter Rate/hour: ";
    cin>>rate;
}

void WageEmployee::display(){
    Employee::display();
    cout<<"Total Working Hours: "<<noOfHours<<endl;
    cout<<"Rate/hour: "<<rate<<endl;
    cout<<"WageEmployee Salary: "<<calSalary()<<endl;
}

int WageEmployee::getHours(){
    return noOfHours;
}

double WageEmployee::getRate(){
    return rate;
}

double WageEmployee::calSalary(){
  return  noOfHours * rate;
}