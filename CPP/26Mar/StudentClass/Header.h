#ifndef HEADER_H
#define HEADER_H
#include<string>
#include<iostream>

using namespace std;

class Student
{
	int roll;
	string name;
	int marks;

	public: 
		Student();
		Student(int, string, int);
		friend ostream& operator<<(ostream &, const Student &);
		friend istream& operator>>(istream &, Student &); 
};

#endif
