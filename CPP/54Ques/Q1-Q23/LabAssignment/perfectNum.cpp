//WAP to check if number entered by user is Prefect No. or not.

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
