/*
Write a program using STL vector. The program should read in ten integers from the standard input and store each value in the vector. 
Now perform below operations.
Insert two more values into the vector at the end of the vector.
Print the vector using subscript notation.
Remove two elements of vector from end.
Print the vector using iterator.
*/

#include<iostream>
#include<string>
#include<vector>
#include<algorithm>
using namespace std;

int main(){
    vector<int> v;
    for(int i = 0; i<=10; i++){
        cin>>i;
        v.push_back(i);
    }
    v.push_back(10);
    v.push_back(20);
     
    for(int  i = 0; i < v.size(); i++){
        cout<<v[i]<<" ";
    }
    cout<<endl;

    v.pop_back();
    v.pop_back();

    vector<int>::iterator it = v.begin();
    while(it!=v.end()){
        cout<<*it<<" ";
        ++it;
    }
}