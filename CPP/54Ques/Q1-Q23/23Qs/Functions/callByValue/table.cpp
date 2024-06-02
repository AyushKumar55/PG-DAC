/*
Write a program to generate following table:
------------------------------------
    Data Type       Size in Bytes
------------------------------------
     Integer              4
------------------------------------
    Character             1
------------------------------------
      Float               4
------------------------------------

*/

#include<iostream>
using namespace std;

//Function for printing borders
void charLine(char ch, int n){
    for(int i=0; i<n; i++){
        cout<<ch;
    }
    cout<<endl;
}

int main(){
    int n;
    cout<<"Enter the length of the border (BETTER TO ENTER MINIMUM 40)\n";
    cin>>n;
    char ch = '-';

    charLine(ch,n);
    cout<<"\tData Type\tSize in Bytes\t\n";
    charLine(ch,n);
    cout<<"\t Integer \t-3      4\t\n";
    charLine(ch,n);
    cout<<"\tCharacter\t      1\t\n";
    charLine(ch,n);
    cout<<"\t  Float  \t      4\t\n";

    return 0;
}