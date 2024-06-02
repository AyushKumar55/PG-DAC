#include<iostream>
#include<string>
#include "Student.h"
using namespace std;

void Student::Accept(){
	cout<<"STUDENT INFO:"<<endl;
	cout<<"Enter Roll No.\n";
	cin>>roll;
	cin.get();
	cout<<"Enter Name\n";
	getline(cin, name);
	cout<<"Enter Marks\n";
	cin>>marks;
}

void Student::Display(){
	cout<<roll<<"  "<<name<<"  "<<marks<<endl;
}

int Student::getMarks(){
	return marks;
}

int Student::getRoll(){
	return roll;
}

string Student::getName(){
	return name;
}

void sortByMarks(Student *arr, int n){
	int i,j;
	Student temp;
	for(int i=0; i<n; i++){
		for(int j=i+1; j<n; j++){
			if(arr[i].getMarks()>arr[j].getMarks()){
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
	}
}

void sortByRoll(Student *arr, int n){
	int i,j;
	Student temp;
	for(int i=0; i<n; i++){
		for(int j=i+1; j<n; j++){
			if(arr[i].getRoll()>arr[j].getRoll()){
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
	}
}


void sortByName(Student *arr, int n){
	int i,j;
	Student temp;
	for(int i=0; i<n; i++){
		for(int j=i+1; j<n; j++){
			if(arr[i].getName()>arr[j].getName()){
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
	}
}
