#include<iostream>
using namespace std;

int* max(int *a, int *b){        //a and b have addresses while *a and *b have values, respectively.
    if(*a > *b)                  
        return a;                
    else
        return b;
}

int main(){
    int a,b;
    cout<<"Enter First Number\n";
    cin>>a;
    cout<<"Enter Second Number\n";
    cin>>b;

    int *result = max(&a, &b);   //Address of a and b passed as arguments & return type is integer pointer
    
    cout<<"The Greater number is "<<*result<<" at Address "<<result;

    return 0;
}