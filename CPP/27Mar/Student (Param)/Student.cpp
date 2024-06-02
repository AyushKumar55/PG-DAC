#include "Student.h"


Student::Student():roll(0),name("")
{
	cout<<"DEFAULT CTOR of Student Class\n";
}

Student::Student(int i, string str):pAdd("C-14","Priyadarshini","411008"),cert(3045,"PGDAC","CDAC")
{
	roll = i;
	name = str;
	cout<<"PARAM CTOR of Student Class\n";
}

void Student::accept(){
	cout<<"Enter your Roll No.\n";
	cin>>roll;
	cout<<"Enter your Name\n";
	cin>>name;
	pAdd.accept();
	cert.accept();
}

void Student::display(){
	cout<<"Roll No.: "<<roll<<endl;
	cout<<"Name: "<<name<<endl;
	pAdd.display();
	cert.display();
}





