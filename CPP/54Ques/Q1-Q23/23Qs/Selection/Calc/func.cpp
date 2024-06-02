#include <iostream>
using namespace std;

void add(int a, int b){
    cout<<"Enter 1st Number\n";
    cin>>a;
    cout<<"Enter 2nd Number\n";
    cin>>b;
    cout<<"Addition = "<<a+b<<endl;
}

void substract(int a, int b){
    cout<<"Enter 1st Number\n";
    cin>>a;
    cout<<"Enter 2nd Number\n";
    cin>>b;
    cout<<"Subtraction = "<<a-b<<endl;
}

void multiply(int a, int b){
    cout<<"Enter 1st Number\n";
    cin>>a;
    cout<<"Enter 2nd Number\n";
    cin>>b;
    cout<<"Multiplication = "<<a-b<<endl;
}

void divide(int a, int b){
    cout<<"Enter 1st Number\n";
    cin>>a;
    cout<<"Enter 2nd Number\n";
    cin>>b;
    if (b != 0)
        cout<<"Division = "<<a/b<<endl;
    else 
        cout<<"Error: Cannot divide by zero\n";
}