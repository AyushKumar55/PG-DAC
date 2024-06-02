#ifndef SQUARE_H
#define SQUARE_H

#include "Shape.h"

class Square:public Shape
{
	float side;
	
	public:
	void accept();
	float calcArea();
	float calcPeri();
	void display();
};

#endif
