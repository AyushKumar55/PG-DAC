//Copy characters from one array into another array 

#include<iostream>
using namespace std;

void accept(char *a, int n){
	cout<<"Enter the elements of the array\n";
	for(int i = 0; i<n; i++){
	cin>>a[i];
	}
}

void copyArray(char *a, char *b, int n){
	for(int i=0; i<n; i++){
		b[i] = a[i];	
	}
}

void print(char *a, char *b, int n){
	cout<<"\nCopied Array\n";
	for(int i=0; i<n; i++){
		cout<<b[i]<<" ";
	}
	cout<<endl;
}

int main(){
	int n;
	cout<<"Enter the count of the numbers\n";
	cin>>n;
	char a[n];
	char b[n];
	accept(a,n);
	copyArray(a,b,n);
	print(a,b,n);
	
	return 0;
}

