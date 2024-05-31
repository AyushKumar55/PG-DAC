//To check if entered number is perfect or not
//A number is perfect if sum of its proper divisors is equal to the number itself.
//ex - 28(1+2+4+7+14 = 28) 

#include<iostream>
using namespace std;

int main(){
	int n, sum = 0;
	cout<<"Enter a number\n";
	cin>>n;

	for(int i=1;i<=n/2;i++){
		if(n%i==0){
			sum = sum + i;
		}
	}
	if(n==sum){
		cout<<n<<" is a PERFECT NUMBER\n";
	}
	else {
		cout<<n<<" is not a PERFECT NUMBER\n";
	}
	return 0;
}
