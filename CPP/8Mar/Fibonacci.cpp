//Fibonacci Series
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
