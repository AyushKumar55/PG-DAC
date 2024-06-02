#include "Address.h"

Address::Address():flat(""),area(""),pin("")
{
	cout<<"DEFAULT CTOR of Address Class\n";
}

/*
Address::Address(string a, string b, string c):flat(a),area(b),pin(c)
{
	cout<<"PARAM CTOR of Address Class\n";
}
*/

void Address::accept(){
	cout<<"Enter your Flat no.\n";
	cin>>flat;
	cout<<"Enter your Area\n";
	cin>>area;
	cout<<"Enter your Pincode\n";
	cin>>pin;
}

void Address::display(){
	cout<<"FLAT NO: "<<flat<<endl;
	cout<<"AREA: "<<area<<endl;
	cout<<"PINCODE: "<<pin<<endl;
}
