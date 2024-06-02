#include<iostream>
#include<string>
using namespace std;

int main(){
string* str = new string[5];
cout<<"Enter 5 strings\n";
for(int i = 0; i<5; i++){
cin>>str[i];
}

for(int i = 0; i<5; i++){
for(int j = i+1; j<5; j++){
if(str[i]>str[j])
{
string temp = str[i];
str[i] = str[j];
str[j] = temp;
}
}
}
for(int i = 0; i<5; i++){
cout<<str[i]<<" ";
}

delete [] str;

return 0;
}
