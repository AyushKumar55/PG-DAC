#include<iostream>
using namespace std;

class arrClass{

	int *arr;
	int size;

	public:

	arrClass(int s){
		size = s;
		arr = new int[size];
	}

	void setAtIndex(int index, int value){
		arr[index] = value;
	}

	int getAtIndex(int index){
		return arr[index];
	}

	~arrClass(){
		delete [] arr;
	}
};

int main(){

	arrClass a(2);
	a.setAtIndex(0,100);
	a.setAtIndex(1,200);
	cout<<"Value = "<<a.getAtIndex(0)<<endl;
	cout<<"Value = "<<a.getAtIndex(1)<<endl;

	return 0;
}
