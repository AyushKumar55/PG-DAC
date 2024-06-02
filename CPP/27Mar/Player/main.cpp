//Hierarchical Inheritance

#include"Cplayer.h"
#include"Fplayer.h"

int main()
{
	Cplayer cp;
	cp.accept();
	cp.display();

	Fplayer fp;
	fp.accept();
	fp.display();

	return 0;
}
