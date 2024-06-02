//Accept n number from user and write functions for finding min ,max , second max and second min from these numbers

#include<iostream>
#include "sortArray.h"
using namespace std;


int main(){
	int n;
	cout<<"Enter the count of numbers\n";
	cin>>n;
	int arr[n];
	for(int i=0; i<n; i++){
	cin>>arr[i];	
	}
	sortArray(arr,n);
	return 0;
}