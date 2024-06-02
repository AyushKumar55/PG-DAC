//Write a program to accept date, month, year from the user in a function called getDate(), 
//and print that date in main() in dd/mm/yy format.

#include<iostream>
using namespace std;

void getData(int *date, int *month, int *year){  
    cout<<"Enter the date\n";
    cin >> *date;                   //pointing to the global variable date of main function  
    cout<<"Enter the month\n";
    cin >> *month;                  //pointing to the global variable month of main function
    cout<<"Enter the year\n";
    cin >> *year;                   //pointing to the global variable year of main function
}

int main(){
    int date, month, year;
    getData(&date, &month, &year); //Address passed for the arguments in callee to be able to access them.
    cout<<"DATE ENTERED IS : "<<date<<"/"<<month<<"/"<<year<<endl; 

    return 0;
}