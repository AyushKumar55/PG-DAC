//Program logic

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
	cout<<"MAX NUM = "<<a[n-1]<<endl;
	cout<<"2ND MAX NUM = "<<a[n-2]<<endl;
	cout<<"MIN NUM NUM = "<<a[0]<<endl;
	cout<<"2ND MIN NUM = "<<a[1]<<endl;
}


