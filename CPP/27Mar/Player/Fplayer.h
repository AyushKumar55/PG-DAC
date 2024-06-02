#ifndef FPLAYER_H
#define FPLAYER_H
#include "Player.h"

class Fplayer:public Player
{
	int goals;

	public:	
	Fplayer();
	Fplayer(string,int,int);
	void accept();
	void display();
};

#endif
