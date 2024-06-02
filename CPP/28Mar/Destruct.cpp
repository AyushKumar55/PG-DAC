//Destructor in inheritance

class Base{
	int *p;
	
	public:
	Base(){
		p = new int;
	}
	// If the destructor here is not made virtual then a memory leakage will be seen at runtime because of static binding.
	virtual	~Base(){
		delete p;
	}
	// If the destructor here is made virtual then memory allocated by p will be freed in runntime because of dynamic binding.
};

class Derived:public Base {
	int *q;
	
	public:
	Derived(){
		q = new int;
	}
	~Derived(){
		delete q;
	}
};

int main(){
	Base *ptr = new Derived; //Pointer type is of Base Class
	delete ptr;
	return 0;
}
