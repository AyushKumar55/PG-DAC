//main.cpp

#include<iostream>
#include "Student.h"
using namespace std;

int main(){
	int i,n,choice;
	Student arr[50];
	cout<<"How many Students\n";
	cin>>n;
	do{
		cout<<"Press 1 - Accept, Display & Sort by Roll No.\n";
		cout<<"Press 2 - Accept, Display & Sort by Marks\n";
		cout<<"Press 3 - Accept, Display & Sort by Name\n";
		cout<<"Press 0 - EXIT\n";
		
		cin>>choice;
		
		switch(choice){
			case 1: {

				for(i=0;  i<n; i++){
					arr[i].Accept();
				}
		
				sortByRoll(arr,n);

				for(i=0; i<n; i++){
					arr[i].Display();
				}
				}
				break;

			case 2: {
				
				for(i=0;  i<n; i++){
					arr[i].Accept();
				}
		
				sortByMarks(arr,n);

				for(i=0; i<n; i++){
					arr[i].Display();
				}
				}
				break;
			case 3: {
				
				for(i=0;  i<n; i++){
					arr[i].Accept();
				}
		
				sortByName(arr,n);

				for(i=0; i<n; i++){
					arr[i].Display();
				}
				}
				break;
					
			default: {
				if(choice == 0)
					cout<<"Thank You\n";
				else
					cout<<"Invalid Choice\n";
			}
		}
	}
	while(choice!=0);

	return 0;
}
