#include<iostream>
using namespace std;

class Check{

	int a; 

	public:

	Check(){
		a = 10;
	}
	void display() const{
		//a = 20;   LEGAL BUT CHANGING VALUES NOT ALLOWED! OUTPUT - 10
		cout<<a<<endl;
	}
};

int main(){

	Check c1;
	c1.display();
	
	return 0;
}
