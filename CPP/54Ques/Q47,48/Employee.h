#ifndef EMPLOYEE_H
#define EMPLOYEE_H

#include<iostream>
#include<cstring>
#include<string>
using namespace std;

class Employee{
    private:
    int emp_id;
    char* emp_name;
    string dob;

    public:
    Employee();
    Employee(int, const char*, string);

    virtual void accept();
    virtual void display();
};

#endif