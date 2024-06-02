#ifndef STUDENT_H
#define STUDENT_H

#include<iostream>
#include<string>
#include "Address.h"
#include "Certificate.h"
using namespace std;

class Student{

	int roll;
	string name;
	Address pAdd;
	Certificate cert;

	public:
	Student();
	//Student(int, string);
	void accept();
	void display();
};

#endif
