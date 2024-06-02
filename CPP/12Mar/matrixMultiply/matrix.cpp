//matrix multiplication program logic

#include<iostream>
#include "matrix.h"
using namespace std;

void accept(int (*matrix1)[3], int (*matrix2)[3])
{
	int i,j;
	cout<<"Enter 1st Matrix of 3X3 Dimension\n";
	for(i=0;i<3;i++)
	{
		for(j=0;j<3;j++)
		{
			cin>>matrix1[i][j];
       		}
	}

	cout<<"Enter 2nd Matrix of 3X3 Dimension\n";
	for(i=0;i<3;i++)
	{
		for(j=0;j<3;j++)
		{
			cin>>matrix2[i][j];
       		}
	}

}

void display(int (*matrix1)[3],int (*matrix2)[3])
{
	int i,j;
	cout<<"1st Matrix of 3X3 Dimension\n";
	for(i=0;i<3;i++)
	{
		for(j=0;j<3;j++)
		{
			cout<<"["<<matrix1[i][j]<<"]";
       		}
		cout<<endl;
	}

	cout<<"Enter 2nd Matrix of 3X3 Dimension\n";
	for(i=0;i<3;i++)
	{
		for(j=0;j<3;j++)
		{
			cout<<"["<<matrix2[i][j]<<"]";
       		}
		cout<<endl;
	}
}


void multiply(int (*matrix1)[3],int  (*matrix2)[3],int (*matrix3)[3])
{	
	int i,j,k;
	for(i=0; i<3; i++)
	{
		for(j=0; j<3; j++)
		{
			for(k = 0; k < j; ++k)
            {
                matrix3[i][j] += matrix1[i][k] * matrix2[k][j];
            }
		}
	}

	cout<<"AFTER MULTIPLICATION\n";
	for(i=0;i<3;i++)
	{
		for(j=0;j<3;j++)
		{
			cout<<"["<<matrix3[i][j]<<"]";
		}
		cout<<endl;
	}

}
	








