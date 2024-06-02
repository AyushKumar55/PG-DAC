#ifndef CPLAYER_H
#define CPLAYER_H
#include "Player.h"

class Cplayer:public Player
{
	int runs;	

	public:	
	Cplayer();
	Cplayer(string,int,int);
	void accept();
	void display();
};

#endif
