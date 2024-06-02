/*Find the sine value of an angle by calculating the following series up to first 5 items
sin(x) = x – x^3/3! + x^5/5! – x^7/7! + x^9/9!
Where x is in radians.
Radian = 180/PI
PI = 3.142
Make use of following functions:
int factorial(int); and int power(int, int);
*/

#include<iostream>
#include<cmath>
using namespace std;

int factorial(int n){
    int facto = 1;
    for(int i = 1; i<=n; i++){
        facto *= i;
    }
    return facto;
}

double power(double base, int exponent){
    double power = pow(base,exponent);
    return power;
}

int main(){
    const double pi = 3.142;
    double x, radians, sine = 0;

    cout<<"Enter any angle in degrees\n";
    cin>>x;
    radians = x * pi / 180;

    for(int i=0; i<5; i++){
        int exponent = i * 2 + 1;
        int sign = (i % 2 == 0) ? 1 : -1;
        sine += sign * power(radians, exponent)/factorial(exponent);
    }
    cout << "Sine of " << x << " degrees is approximately: " << sine << endl;

    return 0;
}