#include "Employee.cpp"
#include "WageEmployee.cpp"
#include "SalesPerson.cpp"

int main(){

    cout<<"Enter Employee Details"<<endl;
    Employee *e = new SalesPerson();

    e->accept();
    e->display();
    
    return 0;
}