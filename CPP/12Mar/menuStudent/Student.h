//Student.h

#include<string>
using namespace std;

class Student{
	private: 
		int roll;
		string name;
		int marks;
	public:
		void Accept();
		void Display();
		int getMarks();
		int getRoll();
		string getName();
};

void sortByMarks(Student* , int);

void sortByRoll(Student* , int);

void sortByName(Student*, int);
