#include"Header.h"

MyArray :: MyArray(int s){
	size = s;
	ptr=new int [size];
}

MyArray :: MyArray():size(0)
{
}

int & MyArray :: operator[](int i)
{
	return ptr[i];
}

const MyArray& MyArray :: operator=(const MyArray & a)
{	if (this == &a)
		return *this;

	this-> size= a.size;
	this-> ptr = new int [size]; // alocating memory for the pointer of invoking object
	for(int i=0 ; i < size; i++ )
	{
		this -> ptr[i] = a.ptr[i];
	}
	return *this;
}

bool MyArray :: operator==(const MyArray &a) const
{
	if (this-> size != a.size)
		return false;

	for (int i =0; i< size; i++)
	{
		if(this-> ptr[i] != a.ptr[i])
			return false;
	}

	return true;
}

bool MyArray :: operator!=(const MyArray &a) const
{
        if (this-> size != a.size)
                return true;

        for (int i =0; i< size; i++)
        {
                if(this-> ptr[i] != a.ptr[i])
                        return true;
        }

        return false;
}

MyArray :: ~MyArray(){
	cout << "DTOR Called !!" << endl;
	delete []ptr;
}



