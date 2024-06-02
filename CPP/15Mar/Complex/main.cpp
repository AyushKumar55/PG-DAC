#include "Complex.h"

int main(){

Complex c1(10,10),c2(20,20),c3,c4(60,60);
c3=c1+c2;
cout<<"\nValue after Addition :"<<endl;
c3.displayAdd();
c3=c4-c2;
cout<<"\nValue after Subtraction :"<<endl;
c3.displaySub();

return 0;
}
