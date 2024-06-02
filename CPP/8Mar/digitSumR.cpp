//sum of the digits using recursion

#include<iostream>
using namespace std;

int sumDigitR(int n){

	if(n==0){
		return 0;
	}
	return (n%10 + sumDigitR(n/10)); 
}

int main(){
	int n;
	cout<<"Enter a 4 digit number\n";
	cin>>n;
	int ans = sumDigitR(n);
	cout<<"Sum of the digits = "<<ans<<endl;

	return 0;
}
