#include<iostream>
using namespace std;

class Complex
{

	int i, j;	

	public:
		Complex(int i=0,int j=0);
		void Accept();
		void displayAdd() const;
		void displaySub() const;
		int getValueI() const;
		void setValueI(int);
		Complex operator+(const Complex& c2) const;
		Complex operator-(const Complex& c2) const;
};


