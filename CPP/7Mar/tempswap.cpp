////Program to swap to numbers using a thrid variable

#include<iostream>
using namespace std;

int main(){
	int a,b,temp;
	cout<<"Enter two no \n";
	cin>>a>>b;
	temp = a;
	a = b;
	b = temp;
	cout<<"AFTER SWAPPING\n"<<a<<" " <<b<<"\n";

return 0;
}
