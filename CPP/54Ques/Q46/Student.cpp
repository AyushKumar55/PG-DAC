#include "Student.h"

int Student::counter = 0;

Student::Student() : dob() {
    roll = ++counter;
    name = new char[30];
    strcpy(name,"NONE");
}


Student::Student(const char* n, int d, int m, int y){
    roll = ++counter;
    name = new char[strlen(n+1)];
    strcpy(name,n);
    dob.day=d;
    dob.month=m;
    dob.year=y;
}

void Student::accept(){
    cout << "Enter name: ";
    cin.getline(name,50);

    cout << "Enter date of birth (DD MM YYYY): ";
    int d, m, y;
    cin >> d >> m >> y;
    dob = Date(d, m, y);
}

void Student::display(){
    cout << "Roll number: " << roll <<" ";
    cout << "Name: " << name << " ";
    dob.display();
}