#ifndef HEADER_H
#define HEADER_H

class MyArray
{
	int size;
	int *ptr;

	public : 
		
		MyArray();
		MyArray(int);
		int & operator[](int);
		const MyArray& operator=(const MyArray &);
		bool operator==(const MyArray &)const;
		bool operator!=(const MyArray &) const;
		~MyArray();
};

#endif
