#include "SalesPerson.h"

SalesPerson::SalesPerson(){
    items = 0 ;
    commission = 0.0;
}

SalesPerson::SalesPerson(int i, double c){
    items = i;
    commission = c;
}

void SalesPerson::accept(){
    wage.accept();
    cout<<"Enter Total Items Sold: ";
    cin>>items;
    cout<<"Enter Suitable Commission: ";
    cin>>commission;
}

void SalesPerson::display(){
    wage.display();
    cout<<"Total Items: "<<items<<endl; 
    cout<<"Suitable Commission: "<<commission<<endl;
    cout<<"SalesPerson Salary: "<<calSalary()<<endl;
}

double SalesPerson::calSalary(){
    return (wage.getHours()*wage.getRate())+(items * commission);
}
