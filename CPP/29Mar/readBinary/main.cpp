//add student data in binary format and read in string format

#include"Student.h"
#include<iostream>
#include<fstream>
#include<cstdlib>
using namespace std;
int main()
{
	char fname[100];
	cout<<"\n Enter filename:";
	cin>>fname;
	
	int n;
	
	cout << "Enter total number of students: ";
	cin>> n;
	int i=0;

	Student s[n];
	
	int choice=99;
	while(choice!=0)
	{
	cout<< "Total Students data can be accepted: "<< n-i <<"\nPress 1 to Add student, Press 2 to Display Students, Press 0 to exit: ";
	cin>> choice;
	 switch(choice)
	 {	case 1:  {
	 		if(i>=n) {cout<<"Max data entry limit reached." ; exit(0); };
			ofstream fout(fname,ios::app|ios::binary);
				
			if(!fout)
				{
				cout<<"\n File Not found";
				return -1;
				}
			s[i].Accept();
			fout.write((char*)&s[i],sizeof(Student));
			
			fout.close();
			i++;
			
			}
			break;
		case 2: {
			ifstream fin(fname,ios::binary);
			if(!fin)
				{
				cout<<"\n File Not found"<<endl;
				return -1;
				}
			cout<<"\n Student records from file"<<endl;
			Student s;
			while(fin.read((char*)&s,sizeof(Student)))
			{
			s.Display();	
			}
			fin.close();	
			}
			break;
		case 0: exit(0);
		break;
		default: {
			cout<< "Invalid input.";
			exit(0);
			}
	
	}
	}
	return 0;
}
