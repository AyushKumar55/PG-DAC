#include "Certificate.h"

Certificate::Certificate():certNo(0),certName(""),issuedBy("")
{
	cout<<"DEFAULT CTOR of Certficate Class\n";
}

/*
Certificate::Certificate(int no, string name, string issued):certNo(no),certName(name),issuedBy(issued){
	cout<<"PARAM CTOR of Certificate Class\n";
}
*/

void Certificate::accept(){
	cout<<"Enter Certificate No.\n";
	cin>>certNo;
	cout<<"Enter Certificate Name\n";
	cin>>certName;
	cout<<"Enter Issuing Authority Name\n";
	cin>>issuedBy;
}

void Certificate::display(){
	cout<<"Certificate No: "<<certNo<<endl;
	cout<<"Certificate Name: "<<certName<<endl;
	cout<<"Issued By: "<<issuedBy<<endl;
}
