#ifndef ADDRESS_H
#define ADDRESS_H

#include<iostream>
#include<string>
using namespace std;

class Address{

	string flat;
	string area;
	string pin;
	
	public:
	Address();
	Address(string, string, string);
	void accept();
	void display();
};

#endif


