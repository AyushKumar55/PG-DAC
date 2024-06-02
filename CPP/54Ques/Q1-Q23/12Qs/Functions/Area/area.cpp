//Write functions for calculating area of circle, rectangle, and square and call these functions from main function.

#include<iostream>
#include "callArea.h"
using namespace std;

int main(){
    int n;
    do{
        cout<<"For area of Circle Press 1 & Enter"<<endl<<"For area of Rectangle Press 2 & Enter"
        <<endl<<"For area of Square Press 3 & Enter"<<endl<<"Exit by pressing 0 & Enter"<<endl<<endl;
        cin>>n;
        switch(n){
            case 1:{
                float circle = Circle();
                cout<<"Area of Circle = "<<circle<<endl<<endl;
                break;
            }

            case 2:{
                float rec = Rectangle();
                cout<<"Area of Rectangle = "<<rec<<endl<<endl;
                break;
            }

            case 3:{
                float sqr = Square();
                cout<<"Area of Square = "<<sqr<<endl<<endl;
                break;
            }

            default:
                cout<<"Thank You!"<<endl;
        }
    }
    while (n!=0); 
    return 0;
}