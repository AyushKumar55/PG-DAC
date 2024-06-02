#ifndef SALESPERSON_H
#define SALESPERSON_H

#include "WageEmployee.h"
class SalesPerson : public Employee{
    int items;
    double commission;
    WageEmployee wage;

    public:
    SalesPerson();
    SalesPerson(int, double);
    void accept();
    void display();
    double calSalary();
};


#endif
