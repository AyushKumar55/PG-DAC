//Write a program to generate following output.
123454321
1234 4321
123   321
12     21
1       1

#include<iostream>
using namespace std;

int main(){
    int n;
    cout<<"Enter any number\n";
    cin>>n;
    for(int i=1; i<=n; i++){
        for(int j=1; j<=n-i+1; j++){
            cout<<j;
        }
        for(int k=2; k<=i; k++){
            cout<<"  ";
        }
        cout<<"\b";
        for(int l=n-i+1; l>0; l--){
            cout<<l;
        }
        cout<<endl;
    }
    return 0;
}