//find avgerage of n numbers

#include<iostream>
using namespace std;

int main(){
	int n;
	cout<<"Enter the count of numbers\n";
	cin>>n;
	int arr[n], sum = 0;

	for(int i=0; i<n; i++){
		cin>>arr[i];
		sum+=arr[i];
	}
	cout<<"Avg of entered numbers = "<<sum/n<<endl;

	return 0;
}
