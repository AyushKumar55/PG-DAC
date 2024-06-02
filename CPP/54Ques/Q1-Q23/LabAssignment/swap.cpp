//Swap two numbers without using 3rd variable.

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
