#ifndef PLAYER_H
#define PLAYER_H

#include<iostream>
#include<string>
using namespace std;

class Player{

	string name;
	int age;
	
	public:
	Player();
	Player(string, int);
	void accept();
	void display();
};

#endif








