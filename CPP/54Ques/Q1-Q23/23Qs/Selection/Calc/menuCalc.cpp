//Using switch-case construct, write a menu driven program to perform basic calculations 
//(addition, subtraction, multiplication and division) on two user entered numbers.

#include<iostream>
#include "calc.h"
using namespace std;

int main(){
    float a,b;
    char ch;
    
    do{
        cout<<"\nPress + to Add\nPress - to Subtract\nPress * to Multiply\nPress / to Divide\nPress 0 to Exit\n";
        cin>>ch;

        switch(ch){
            case '+':
                add(a,b);
                break;
            case '-':
                substract(a,b);
                break;
            case '*': 
                multiply(a,b);
                break;
            case '/': 
                divide(a,b);
                break;
            default:
                if(ch=='0')
                    cout<<"Thank You\n";
                else
                    cout<<"Invalid Choice. Try Again!";
        }
    }
    while(ch!='0');

    return 0;
}