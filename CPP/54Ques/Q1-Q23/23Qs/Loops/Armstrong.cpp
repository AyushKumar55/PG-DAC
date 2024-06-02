//Write a program to print whether user entered number is an Armstrong number.  
//Armstrong number is one for which the sum of the cube of all its digits is same as the number.  
//For example, 153 = (1*1*1) + (5*5*5) + (3*3*3)

#include<iostream>
#include<cmath>
using namespace std;

int main(){
    int n;
    cout<<"Enter any number"<<endl;
    cin>>n;

    int originalNo = n;
    int count = 0;
    int sum = 0;
    int temp = n;

    while(temp!=0){
        count++;
        temp /= 10;
    }
    while(n!=0){
        int digit = n%10;
        sum += pow(digit,count);
        n /= 10;
    }
    if(originalNo == sum){
        cout<<"Yes, Armstrong No.";
    }
    else
        cout<<"Not an Armstrong No.";
}