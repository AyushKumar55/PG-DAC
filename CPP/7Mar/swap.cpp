//Program to swap to numbers without using a thrid variable

#include<iostream>
using namespace std;
int main(){
	int a, b;
 	cout<<"Enter two no\n";
	cin>> a>>b;
	a = a+b;
	b = a-b;
	a = a-b;
	cout<<"After swapping\n"<<a<<" "<<b<<"\n";

return 0;
}
