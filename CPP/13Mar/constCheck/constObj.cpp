#include<iostream>
using namespace std;

class Check{

	int a; 

	public:

	Check(){
		a = 10;
	}
	void display(){
		a = 20;  //ILLEGAL AND ERROR!
		cout<<a<<endl;
	}
};

int main(){

	const Check c1;
	c1.display();
	
	return 0;
}
