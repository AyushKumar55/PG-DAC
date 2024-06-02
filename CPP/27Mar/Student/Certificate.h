#ifndef CERTIFICATE_H
#define CERTIFICATE_H

#include<iostream>
#include<string>
using namespace std;

class Certificate{
	int certNo;
	string certName;
	string issuedBy;

	public:
	Certificate();
	//Certificate(int, string, string);
	void accept();
	void display();
};

#endif
