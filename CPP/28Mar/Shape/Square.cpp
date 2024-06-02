#include "Square.h"

void Square::accept(){
	cout<<"Enter the side of Square\n";
	cin>>side;
	}

float Square::calcArea(){
	float area = side * side;
	return area;
}

float Square::calcPeri(){
	float peri = 4 * side ;
	return peri;
}

void Square::display(){
	cout<<"Area of Square = " <<calcArea()<<endl;
	cout<<"Perimeter of Square = "<<calcPeri()<<endl;
}


