//Write a function for factorial and use the function for printing factorial series like 1 2 6 24 120………

#include<iostream>
using namespace std;

void facto(int n){
    for(int i = 1; i<=n; i++){
        int fact = 1;
        for(int j=i; j>0; j--){
            fact *= j;
        }
        cout<<fact<<" ";
    }
}

int main(){
    int n;
    cout<<"Enter any number for Factorial Series.\n";
    cin>>n;

    facto(n);

    return 0;
}