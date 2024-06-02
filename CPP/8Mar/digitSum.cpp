//sum of the digits

#include<iostream>
using namespace std;

int sumDigit(int n){

	int sum = 0;
	while(n!=0){
	int digit = n%10;
	sum +=	digit;
	n/=10;
	}
	return sum;

}

int main(){
	int n;
	cout<<"\nEnter a 4 digit number\n";
	cin>>n;

	int ans = sumDigit(n);	
	cout<<"Sum of the digits = "<<ans<<endl;
	return 0;
}
