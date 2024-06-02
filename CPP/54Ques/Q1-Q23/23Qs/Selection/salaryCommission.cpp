/*
Write a program to accept the basic salary and total sales amount for a salesperson and calculate commission according to sales amount. 
Display the net salary and commission earned. (Net Salary = Basic Salary + Commission) The range is as follows.

Sales Amount in Rupees  Commission on Sales 
5000 to 7500            3%
7501 to 10500           8%
10501 to 15000          11%
15000 and above         15%
*/

#include<iostream>
using namespace std;

void print(double commission, int basic){
    int netSalary = 0;
    netSalary = basic + commission;
    cout<<"Your Net Salary = "<< netSalary<<endl;
    cout<<"Your Commission = "<<commission<<endl;
}

int main(){

    int basic, sales;
    double commission = 0;
    cout<<"Enter your basic salary\n";
    cin>>basic;
    cout<<"Enter your total sales amount\n";
    cin>>sales;

    if(sales >= 5000 && sales <= 7500){
        commission = 0.3 * sales;
        print(commission, basic);        
    }
    else if(sales > 7500 && sales <= 10500) {
        commission = 0.8 * sales;
        print(commission, basic);
    }
    else if(sales > 10500 && sales <15000){
        commission = 0.11 * sales;
        print(commission, basic);
    }
    else {
        commission = 0.15 * sales;
        print(commission, basic);
    }
    return 0;
}