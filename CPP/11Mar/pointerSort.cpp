//sorting by passing pointer array

#include<iostream>
using namespace std;

void accept(int *a, int n){
	for(int i = 0; i<n; i++){
	cin>>a[i];
	}
}

void sortArray(int *a,int n){
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
}

void print(int *a, int n){
	cout<<"Sorted Array"<<endl;
	for(int i=0; i<n; i++){
		cout<<"["<<a[i]<<"]";
	}
	cout<<endl;
}

int main(){
	int n;
	cout<<"Enter the count of the numbers\n";
	cin>>n;
	int a[n];
	accept(a,n);
	sortArray(a,n);
	print(a,n);
	
	return 0;
}

