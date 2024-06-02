#include<iostream>
#include"Header.h"

using namespace std;

int main(){
	MyArray arr1(3);
	
	arr1[2] = 100;
	arr1[1] = 200;
	arr1[0] = 300;
	cout  << arr1[2] << endl;
	
	MyArray arr2;
	arr2 = arr1;
	cout << arr2[0] <<endl<< arr2[1] <<endl<< arr2[2] << endl;
	
	
	MyArray arr3(3);
	arr3[0] = 90;
	arr3[1] = 78;
	arr3[2] = 100;
	
	if (arr1 == arr2)
		cout<< "same" <<endl;
	else 
		cout << "Not same" << endl;

	
	
	if (arr1 != arr3)
                cout<< "Not same" <<endl;
        else
                cout << "same" << endl;


	return 0;

}
