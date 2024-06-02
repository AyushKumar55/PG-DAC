//Write a function to find the binary equivalent of this number using recursion.

#include <iostream>
using namespace std;

int convert(int num)
{
    if (num == 0) 
        return 0; 
    else
        return (num % 2 + 10 * convert(num / 2));
}
 
int main()
{
    int num;
    cout<<"Enter any number\n";
    cin>>num;
    cout << "Binary Equivalent = "<<convert(num);
    return 0;
}