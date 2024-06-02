//Write a program to find maximum of three numbers using conditional operators.

#include<iostream>
using namespace std;

int main(){
    int a,b,c;
    cout<<"Enter any three numbers\n";
    cin>>a>>b>>c;

    cout<<"Max = "<<((a>b) ? ((a>c) ? a : c) : ((b>c) ? b : c))<<endl;

    return 0;
}