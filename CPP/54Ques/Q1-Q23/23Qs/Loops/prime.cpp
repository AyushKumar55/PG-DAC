//Write a program to display whether a user entered number is prime or not.

#include<iostream>
#include<cmath>
using namespace std;

bool isPrime(int n){
    if (n <= 1) {
        return false;
    }
    if (n <= 3) {
        return true;
    }
    for (int i = 2; i <= sqrt(n); i++) {
        if (n % i == 0) {
            return false;
        }
    }
    return true;
}

int main(){
    int num;
    cout<<"Enter any number\n";
    cin>>num;

    if (isPrime(num)) {
        cout << num << " is a prime number." << endl;
    } else {
        cout << num << " is not a prime number." << endl;
    }
    return 0;
}