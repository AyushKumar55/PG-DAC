//Draw a rectangle for user defined dimensions of length and breadth. 

#include <iostream>
using namespace std;

int main() {
    int length, breadth;
    cout << "Enter the length of the rectangle: ";
    cin >> length;
    cout << "Enter the breadth of the rectangle: ";
    cin >> breadth;

    for (int i = 0; i < length; i++) {
        for (int j = 0; j < breadth; j++) {
            if (i == 0 || i == length - 1 || j == 0 || j == breadth - 1)
                cout << "* "; 
            else
                cout << "  "; 
        }
        cout << endl;
    }

    return 0;
}
