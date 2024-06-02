#ifndef DATE_H
#define DATE_H

#include<iostream>
using namespace std;

class Date{
    public:
    int day;
    int month;
    int year;

    Date():day(1),month(1),year(1999){} // Default CTOR

    Date(int d, int m, int y):day(d),month(m),year(y){} //PARAM CTOR

    // To display dob of student
    void display(){
        cout<<"Date of Birth - "<<day<<"/"<<month<<"/"<<year<<endl;
    }
};

#endif