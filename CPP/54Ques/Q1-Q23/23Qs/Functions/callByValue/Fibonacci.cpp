// Write a recursive function to obtain n numbers of a Fibonacci series
// 0 1 1 2 3 5 8 13 21 34 55 89...

#include <iostream>
using namespace std;

// Function to calculate Fibonacci series recursively
int fibonacci(int n) {
    if (n <= 1)
        return n;
    else
        return fibonacci(n - 1) + fibonacci(n - 2);
}

// Function to print the Fibonacci series
void printFibonacci(int n) {
    for (int i = 0; i < n; ++i) {
        cout << fibonacci(i) << " ";
    }
}

int main() {
    int n;
    cout << "Enter the number of terms in Fibonacci series: ";
    cin >> n;

    cout << "Fibonacci Series: ";
    printFibonacci(n);

    return 0;
}

/*

Without Recursion:

#include<iostream>
using namespace std;

int main(){

	int n;
	cout<<"Enter number of terms\n";
	cin>>n;
	int a = 0, b = 1, c;
	if(n==1){
		cout<<a;
	}
	else if(n==2){
		cout<<"<0 1 ";
	}
	else {
		cout<<"0 1 ";
		for(int i = 3; i<=n; i++){
			c = a + b;
			a = b;
			b = c;
			cout<<c<<" ";
		}
		cout<<endl;
	}
	return 0;
}
*/