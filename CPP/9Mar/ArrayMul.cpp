//Multiply array elemtents by 2

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
	for(int i = 0; i<n; i++){
	cout<<arr[i]<<" ";
	}

	return 0;
}
