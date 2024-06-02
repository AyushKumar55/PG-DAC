//Use of virtual keyword i.e. late binding

#include<iostream>
using namespace std;
class Animal
{
	int weight;
	public:
	Animal():weight(0){}; 
	void setWeight(int w)
	{
	weight = w;
	}
	virtual void display(){
		cout<<"Weight = "<<weight<<endl;
	}
};

class Tiger : virtual public Animal
{
	int height;
	public: 
	Tiger():height(0){};
	void setHeight(int h)
	{
	height = h;
	}
	void display(){
		Animal::display();
		cout<<"Height = "<<height<<endl;
	}
	
};

class Lion : virtual public Animal
{
	int length;
	public:
	Lion():length(0){}; 
	void setLength(int l)
	{
	length = l;
	}
	void display(){
		Animal::display();
		cout<<"Length = "<<length<<endl;
	}
};


class Liger : public Lion, public Tiger
{	
	public : 
	void display(){
		Tiger::display();
		Lion::display();
	}	
};

int main()
{
Liger lg;
Animal *ptr1 = &lg;
lg.setLength(180);
lg.setHeight(150);
ptr1->setWeight(200);
ptr1->display();
return 0;
}
