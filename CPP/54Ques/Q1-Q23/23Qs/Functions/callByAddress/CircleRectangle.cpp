/*
Write a menu driven program, which allows the user to select either a circle or rectangle.

A) Write a single function areaCircum() that calculates the area and circumference of a circle.  
The values of area and circumference should be printed in main()

B) Write a single function areaPeri() that calculates the area  and perimeter of a rectangle. 
The values of area and perimeter should be printed in main()

*/

#include<iostream>
#include<cmath>
using namespace std;

//Function to calculate area and perimeter of circle while also touching the respective global variables
void areaCircum(double *r, double *area, double *perimeter){
    *area = 3.142 * pow(*r,2);
    *perimeter = *r * 3.142 * 2;
}

//Function to calculate area and perimeter of rectangle while also touching the respective global variables
void areaPeri(double *l, double *b, double *area, double*perimeter){
    *area = *l * *b;
    *perimeter = 2 * (*l + *b);
}

int main(){
    int choice;
    double r, l, b, area = 0, perimeter = 0;
    do{
        cout<<"Enter 1 for Circle\nEnter 2 for Rectangle\nEnter 0 to Exit\n";
        cin>>choice;

        switch(choice){
            case 1: {           
                cout<<"Enter the radius of the circle\n";
                cin>>r;
                areaCircum(&r, &area, &perimeter);  
                cout<<"Area of Circle = "<<area<<endl;
                cout<<"Perimeter of Circle = "<<perimeter<<endl<<endl;
            }
            break;

            case 2: {
                cout<<"Enter the length of the rectangle\n";
                cin>>l;
                cout<<"Enter breadth of the rectangle\n";
                cin>>b;
                areaPeri(&l, &b, &area, &perimeter);
                cout<<"Area of Rectangle = "<<area<<endl;
                cout<<"Perimeter of Perimeter = "<<perimeter<<endl<<endl;
            }
            break;

            default:
                if(choice == '0')
                    cout<<"Thank You!\n";
                else
                    cout<<"Invalid choice, Try Again!";
        }
    }
    while(choice != '0');
    
    return 0;
}