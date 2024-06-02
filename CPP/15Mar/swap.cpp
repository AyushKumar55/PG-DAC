#include<iostream>
using namespace std;

class Swapping{

	int a, b, c;

	public:
	Swapping();
	void swap(int a, int b); 
	void swap(int a, int b, int c); //With default argument
};

int main(){

	Swapping s1;

	return 0;
}

Swapping::Swapping(){
	cout<<"Enter 1st number\n";
	cin>>a;
	cout<<"Enter 2nd number\n";
	cin>>b;
	swap(a,b);
	swap(a,b,c);
}

void Swapping::swap(int a, int b, int c){
	c = a;
	a = b;
	b = c;
	cout<<"After Swapping : "<<a<<" "<<b<<endl;
}

void Swapping::swap(int a, int b){
	a = a + b;
	b = a - b;
	a = a - b;
	cout<<"After Swapping : "<<a<<" "<<b<<endl;
}

