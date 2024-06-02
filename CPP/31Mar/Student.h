#ifndef STUDENT_H
#define STUDENT_H

#include<iostream>
#include<algorithm>
#include<vector>
using namespace std;

class Student{

	int roll;
	string name;

	public:
	void accept();
	int getRoll();
	void setName(string& newName);
	void display();
	bool operator<(Student& other);
};

void searchRoll(vector<Student>& );

void updateName(vector<Student>& );

void sortByRoll(vector<Student>& );

#endif
