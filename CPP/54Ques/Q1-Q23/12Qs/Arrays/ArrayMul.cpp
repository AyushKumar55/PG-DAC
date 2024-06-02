//Accept n numbers from user and write a function to multiply each number by 2 and display result.

#include<iostream>
using namespace std;

void multiply(int arr[],int n){
	int mul=1;
	for(int i = 0; i<n; i++){
		mul = arr[i]*2;
		cout<<mul<<" ";
	}
}

int main(){
	int n;
	cout<<"Enter the count of numbers\n";
	cin>>n;
	int arr[n];
	for(int i = 0; i<n; i++){
	cin>>arr[i];
	}
	multiply(arr,n);


	return 0;
}
