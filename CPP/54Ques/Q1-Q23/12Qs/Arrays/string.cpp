//Accept n characters from user and print is as string.

#include<iostream>
using namespace std;

string stringChar(char a[], int n){
	string str = "";
	for(int i=0; i<n; i++){
	str += a[i];	
	}
	return str;
}


int main(){

	int n;
	cout<<"Enter the number of characters\n";
	cin>>n;
	char a[n];
	for(int i=0; i<n; i++){
	cin>>a[i];
	}
	string ans = stringChar(a,n);
	cout<<"String formed by characters : "<<ans<<endl;
	return 0;
}
