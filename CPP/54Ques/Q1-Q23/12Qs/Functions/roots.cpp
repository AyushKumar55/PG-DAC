//Write a program to find the roots of equation using function.

#include<iostream>
#include<cmath>
using namespace std;

void roots(int a, int b, int d){
	int root1 = ((-b + d)/2)*a;
	int root2 = ((-b - d)/2)*a;
	cout<<"roots are : "<<root1<<", "<<root2<<endl;
}

int main(){

	int a,b,c;
	cout<<"Enter three number for a quadratic equation.\n";
	cin>>a>>b>>c;
	int d = sqrt((b*b)-(4*a*c));
	if(d>=0){
		roots(a,b,d);
	}
	else {
		cout<<"roots are imaginary since Determinant = "<<d<<endl;
	}

	return 0;
}
