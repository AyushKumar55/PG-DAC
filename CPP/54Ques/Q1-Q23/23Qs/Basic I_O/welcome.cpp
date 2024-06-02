//Write a program to print “Welcome to C++” using escape sequences: \n, \t, \r, \\.  
//Observe the difference in the output.

#include <iostream>
using namespace std;

int main() {
    // Using \n
    cout << "Welcome\nto\nC++\n";
    
    // Using \t
    cout << "Welcome \tto\tC++\t";
    
    // Using \r
    cout << "Welcome to C++\r";
    
    // Using "\\"
    cout << "Welcome to C++\\"<<endl;

    return 0;
}
