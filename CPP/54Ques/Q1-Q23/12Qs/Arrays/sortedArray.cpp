//Accept n numbers from users and store them in to array, Write a function to sort and display sorted array.

#include<iostream>
using namespace std;

void sortArray(int a[], int n){
	for(int i=0; i<n; i++){
		for(int j=0;j<n; j++){
			if(a[j]>a[j+1]){
				int temp = 0;
				temp = a[j];
				a[j] = a[j+1];
				a[j+1] = temp;
			}
		}
	}
	cout<<"Sorted Array"<<endl;
	for(int i=0; i<n; i++){
		cout<<a[i]<<" ";
	}
}


int main(){
	int n;
	cout<<"Enter the count of the numbers\n";
	cin>>n;
	int arr[n];
	for(int i = 0; i<n; i++){
	cin>>arr[i];
	}
	sortArray(arr,n);
	
	return 0;
}

