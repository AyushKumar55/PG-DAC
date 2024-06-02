#include "Circle.h"

void Circle::accept(){
	cout<<"Enter radius of the Circle\n";
	cin>>radius;
}

float Circle::calcArea(){
	float area = 3.14 * radius * radius;
	return area;
}

float Circle::calcPeri(){
	float peri = 2 * 3.14 * radius;
	return peri;
}

void Circle::display(){
	cout<<"Area of Circle = "<<calcArea()<<endl;
	cout<<"Perimeter of Circle = "<<calcPeri()<<endl;
}
