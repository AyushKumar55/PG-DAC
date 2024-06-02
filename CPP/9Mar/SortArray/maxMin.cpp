//main function for finding 1st Max, 2nd Max, 1st Min and 2nd Min in an array 

#include<iostream>
using namespace std;
#include "sortArray.h"

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

