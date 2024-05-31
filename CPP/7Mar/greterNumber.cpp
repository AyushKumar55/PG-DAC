//To find the greatest betwwen 3 user entered numbers 

#include<iostream>
using namespace std;
int main(){

	int a;
	int b; 
	int c;
	
	cout<<"Enter Three NUmbers\n ";
	cin>>a>>b>>c;

	if(a>b && a>c){
		cout<<a<<" is greatest\n";
	}
	else if(b>c){
		cout<<b<<" is greatest\n";
	}
	else{
		cout<<c<<" is greatest\n";
	}

	return 0;
}
