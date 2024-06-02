#ifndef WAGEEMPLOYEE_H
#define WAGEEMPLOYEE_H

#include<iostream>
#include "Employee.h"
using namespace std;

class WageEmployee : public Employee {
    int noOfHours;
    double rate;

    public:
    WageEmployee();
    WageEmployee(int, double);
    int getHours();
    double getRate();
    void accept();
    void display();
    double calSalary();
};


#endif