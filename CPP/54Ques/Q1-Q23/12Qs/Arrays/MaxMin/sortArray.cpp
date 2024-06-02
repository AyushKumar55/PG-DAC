#include <iostream>
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
	cout<<"1st MAX NUM = "<<a[n]<<endl;
	cout<<"2nd MAX NUM = "<<a[n-1]<<endl;
	cout<<"1st MIN NUM = "<<a[1]<<endl;
	cout<<"2nd MIN NUM = "<<a[2]<<endl;
}