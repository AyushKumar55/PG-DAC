//Write a recursive function to obtain the running sum of n numbers.

#include<iostream>
using namespace std;

int sum(int n){
    if(n <= 1)
        return n;
    return n + sum(n-1);
}

int main(){
    int n;
    cout<<"Enter a number\n";
    cin>>n;

    cout<<"Running sum = "<<sum(n)<<endl;
    return 0;
}