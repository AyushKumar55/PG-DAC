#include "Complex.h"
using namespace std;

Complex::Complex(int i, int j)
{
	this->i=i;
	this->j=j;
}

void Complex::Accept()
{
	cout<<"Enter i:"<<endl;
	cin>>i;
	
	cout<<"Enter j:"<<endl;
	cin>>j;
}

void Complex::displayAdd()const
{
cout<<"\n"<<i<<" + "<<"j"<<j<<endl;
}

void Complex::displaySub()const
{
cout<<"\n"<<i<<" - "<<"j"<<j<<endl;
}

int Complex::getValueI()const{
	return i;
}

void Complex::setValueI(int k){
	i=k;
}

Complex Complex::operator+(const Complex& c2)const{
	Complex c3;
	c3.i = this -> i + c2.i;
	c3.j = this -> j + c2.j;
	return c3;
}
Complex Complex::operator-(const Complex& c2)const{
	Complex c3;
	c3.i = this -> i - c2.i;
	c3.j = this -> j - c2.j;
	return c3;
}




