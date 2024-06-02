//Write a program to accept marks of five subjects from the user and calculate their average. 
//Use implicit and explicit type conversion.

#include <iostream>
using namespace std;

int main() {
    int m1, m2, m3, m4, m5;
    cout<<"Enter the marks of subjects:\n";
    cout<<"Sub 1 = ";
    cin>>m1;
    cout<<"Sub 2 = ";
    cin>>m2;
    cout<<"Sub 3 = ";
    cin>>m3;
    cout<<"Sub 4 = ";
    cin>>m4;
    cout<<"Sub 5 = ";
    cin>>m5;

    int sum = m1 + m2 + m3 + m4 + m5;

    double avg = sum/5;     //implicit type conversion - sum is converted to double after integer division
    double average = (double)sum/5;   //explicit type conversion - sum is converted to double before division

    cout<<"Average using implicit type conversion = "<<avg<<endl;
    cout<<"Average using explicit type conversion = "<<average<<endl;

    return 0;
}