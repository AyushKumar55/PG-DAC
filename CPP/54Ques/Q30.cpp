#include<iostream>
using namespace std;

int main(){
int n;
cout<<"Enter the number of subjects\n";
cin>>n;
int* arr = new int(n);
int sum = 0;
for(int i = 0; i<n; i++){
	cin>>arr[i];
	sum = sum+arr[i];
}
double avg = sum/n;

cout<<"Average marks of all the students: "<<avg;

delete [] arr;

return 0;
}
