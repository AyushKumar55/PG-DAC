#include<iostream>
using namespace std;


float Circle(){
    int r;
    cout<<"Enter the radius of circle\n";
    cin>>r;
    return 3.14*r*r;
}

int Rectangle(){
    int l,b;
    cout<<"Enter the length and breadth of rectangle\n";
    cin>>l>>b;
    return l*b;
}

int Square(){
    int s;
    cout<<"Enter the side of square\n";
    cin>>s;
    return s*s;
}