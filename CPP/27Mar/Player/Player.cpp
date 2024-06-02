#include "Player.h"

Player::Player()
{
	name="";
	age=0;

	cout<<"DEFAULT CTOR of Player Class\n";
}

Player::Player(string n,int a):name(n),age(a) 
{
	cout<<"PARAM CTOR of Player Class\n";
}

void Player::accept(){
	cout<<"Enter your Name\n";
	cin>>name;
	cout<<"Enter your Age\n";
	cin>>age;
	}

void Player::display(){
	cout<<"PLAYER NAME: "<<name<<endl;
	cout<<"PLAYER AGE: "<<age<<endl;
	}
