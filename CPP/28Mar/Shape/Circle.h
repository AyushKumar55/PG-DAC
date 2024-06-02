#ifndef CIRCLE_H
#define CIRCLE_H

#include "Shape.h"

class Circle:public Shape
{
	float radius;

	public:
	void accept();
	float calcArea();
	float calcPeri();
	void display();
};

#endif
