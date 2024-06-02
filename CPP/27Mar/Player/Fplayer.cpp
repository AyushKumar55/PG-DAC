#include "Fplayer.h"

Fplayer::Fplayer(){
	goals = 10;
}

Fplayer::Fplayer(string n, int a, int g):Player(n,a){
	goals = g;
}

void Fplayer::accept(){
	Player::accept();
	cout<<"Enter Goals: \n";
	cin>>goals;
}

void Fplayer::display(){
	Player::display();
	cout<<"Goals = "<<goals<<endl;
}
