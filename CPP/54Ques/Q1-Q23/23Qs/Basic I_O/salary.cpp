/*
Write a program to calculate Net Salary of an employee. Accept Basic Salary (BS) from the user.                                   	
HRA is 15% of BS
DA is 30% of BS
PF is 12.5% of GS
Gross Salary is BS + HRA + DA
Net Salary = Gross Salary – PF
*/


#include <iostream>
using namespace std;

int main() {
    int BS;
    cout<<"Enter your Basic Salary\n";
    cin>>BS;

    double HRA = 0.15 * BS;
    cout<<"\nYour HRA = "<<HRA<<endl;
    double DA = 0.3 * BS;
    cout<<"Your DA = "<<DA<<endl;
    double PF = 0.12 * BS;
    cout<<"Your PF = "<<PF<<endl;
    double GS = HRA + DA + PF;
    cout<<"Your Gross Salary = "<<GS<<endl;

    float netSalary = GS - PF;    
    cout<<"\nYour Net Salary = "<<netSalary<<endl;

    return 0;
}