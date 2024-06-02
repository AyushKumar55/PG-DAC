/*Write a class Student having following –
Student Roll Number (int)
Student Name (char array)
Date of Birth (Date class object where Date is user defined class)
Implement default constructor, parameterized constructor, accept, display. Generate the student roll number automatically.
*/

#ifndef STUDENT_H
#define STUDENT_H

#include<iostream>
#include<cstring> //for strlen() and strcpy()
#include "Date.cpp"
using namespace std;


class Student{
    private:
    int roll;
    char* name;
    Date dob;

    public:
    static int counter;
    Student();  // Default CTOR
    Student(const char*, int,int,int);  // Param CTOR
    void accept(); //Function to accept Student details
    void display(); // Function to display Student details
};

#endif