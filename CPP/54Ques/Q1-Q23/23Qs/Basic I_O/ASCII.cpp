//Accept a character from user. It may be alphabet, digit or any other character. 
//Print its ASCII value.

#include <iostream>
using namespace std;

int main() {
    char ch;
    cout<<"Enter any character\n";
    cin>>ch;

    int a = ch;
    cout<<"ASCII Value : "<<a;

    return 0;
}