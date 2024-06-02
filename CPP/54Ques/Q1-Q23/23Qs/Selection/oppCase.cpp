//Write a program to convert user entered character into its opposite case. 
//Program should also flash an error message if the character entered by the user is not an alphabet.

#include<iostream>
using namespace std;

int main(){
    char ch;
    cout<<"Enter any alphabet\n";
    cin>>ch;
    if(ch>='A' && ch<='Z'){
        int change = ch + 32;
        cout<<"In Lowercase : "<<char(change)<<endl;
    }
    else if(ch>='a' && ch<='z'){
        int change = ch - 32;
        cout<<"In Uppercase : "<<char(change)<<endl;
    }
    else
        cout<<"Character entered is not an Alphabet\n";

    return 0;
}