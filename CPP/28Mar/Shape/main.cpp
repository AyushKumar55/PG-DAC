//Hierarchical Inheritance - Downcasting

#include "Circle.h"
#include "Rectangle.h"
#include "Square.h"

int main(){
	
	Shape *sp1 = new Circle;
	sp1->accept();
	sp1->display();

	Shape *sp2 = new Rectangle;
	sp2->accept();
	sp2->display();

	Shape *sp3 = new Square;
	sp3->accept();
	sp3->display();

	return 0;
}
