#include"Header.h"
#include<iostream>

using namespace std;

Student :: Student()
{
}

Student :: Student(int r, string n, int m)
{
	roll = r;
	name = n;
	marks = m;
}

ostream & operator<<(ostream & os, const Student & s)
{
	return os<< "Roll : "<<  s.roll <<endl << "Name : " << s.name<< endl <<"Marks : "<< s.marks << endl; 
}

istream & operator>>(istream & is, Student &s)
{	
	cout << "Enter Roll, Name and marks : " << endl;
	return is >> s.roll >> s.name >> s.marks;
}

