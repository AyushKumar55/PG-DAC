//matrix multiplication main function

#include<iostream>
#include"matrix.h"
using namespace std;

int main(){

	int matrix1[3][3], matrix2[3][3];
 	int matrix3[3][3];

	accept(matrix1,matrix2);
	display(matrix1, matrix2);	
	multiply(matrix1, matrix2, matrix3);

return 0;
}
