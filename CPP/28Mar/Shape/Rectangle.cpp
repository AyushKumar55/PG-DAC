#include "Rectangle.h"

void Rectangle::accept(){
	cout<<"Enter the length of rectangle\n";
	cin>>length;
	cout<<"Enter the breadth of rectangle\n";
	cin>>breadth;
}

float Rectangle::calcArea(){
	float area = length * breadth;
	return area;
}

float Rectangle::calcPeri(){
	float peri = 2 * (length + breadth);
	return peri;
}

void Rectangle::display(){
	cout<<"Area of Rectangle = " <<calcArea()<<endl;
	cout<<"Perimeter of Rectangle = "<<calcPeri()<<endl;
}
