#include<iostream>
using namespace std;

int main(){
    cout<<"Enter 10 numbers\n";
    int arr[10];
    
    for(int i = 0; i<10; i++){
        arr[i]=100+i;
    }

    for(int i = 0; i < 10; i++){
        int sum = 0;
        int n = arr[i];
        while(n!=0){
            int rem = n%10;
            sum+=rem;
            n/=10;
        }
        if(sum%7!=0){
            cout<<arr[i] <<" ";
        }
    }
}
