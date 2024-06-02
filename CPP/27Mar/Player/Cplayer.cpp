#include "Cplayer.h"

Cplayer::Cplayer(){
	runs = 100;
}

Cplayer::Cplayer(string n, int a, int r):Player(n,a){
	runs = r;
}

void Cplayer::accept(){
	Player::accept();
	cout<<"Enter Runs: \n";
	cin>>runs;
}

void Cplayer::display(){
	Player::display();
	cout<<"Runs = "<<runs<<endl;
}
