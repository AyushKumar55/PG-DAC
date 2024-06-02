#include "Student.h"

void Student::setName(string& newName){
	name = newName;
}

void Student::accept(){	
	cout<<"Enter the Roll No.: ";
	cin>>roll;	
	cout<<"Enter Name: ";
	cin.get();
	getline(cin,name);
}

int Student::getRoll(){
	return roll;
}

void Student::display(){
	cout<<"Roll No. : "<<roll<<"\tName : "<<name<<endl;
}

bool Student::operator<(Student& other){
	return roll < other.roll;
}
