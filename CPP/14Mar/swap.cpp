//swapping two numbers by references

#include<iostream>
using namespace std;

void swap(int &a, int &b){
	int temp=0;
	temp = a;
	a = b;
	b = temp;
}

int main(){

	int a,b;
	cout<<"Enter any two numbers\n";
	cin>>a>>b;
	swap(a,b);
	cout<<"After swapping: \n";
	cout<<a<<" "<<b<<endl;
	return 0; 
}
