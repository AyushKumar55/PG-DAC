#ifndef RECTANGLE_H
#define RECTANGLE_H

#include "Shape.h"

class Rectangle:public Shape
{
	float length;
	float breadth;

	public:
	void accept();
	float calcArea();
	float calcPeri();
	void display();
};

#endif
