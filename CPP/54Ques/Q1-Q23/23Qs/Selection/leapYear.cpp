//Write a program to find leap year by using:
//a. if-else and logical operators (&& and ||)
//b. Conditional Operators (? :)

#include<iostream>
using namespace std;

int main(){
    int year;
    cout<<"Enter the year\n";
    cin>>year;

    //Using if-else and logical operators (&& and ||)
    if(year % 400 == 0 || ( year % 4 == 0 && year % 100 != 0))
        cout<<"Leap Year\n";
    else
        cout<<"Not a Leap Year\n";

    
    //Using Conditional Operators (? :)
    //year % 400 == 0 || ( year % 4 == 0 && year % 100 != 0) ? cout<<"Leap Year\n" : cout<<"Not a Leap Year\n"; 

    return 0;
} 