#ifndef SHAPE_H
#define SHAPE_H

#include <iostream>
using namespace std;

class Shape
{
	public:
	virtual void accept()=0;
	virtual float calcArea()=0;
	virtual float calcPeri()=0;
	virtual void display()=0;
};

#endif
