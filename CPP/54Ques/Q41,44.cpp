#include<iostream>
using namespace std;

class Array{
    private:
    int size;
    int *arr;

    public:

    Array():size(5)
    {
        arr = new int[5];
        for(int i=0; i<5;i++)
        {
            arr[i]=0;
        }
    }
    Array(int s){
        size = s;
        arr = new int[s];
        for(int i=0; i<size; i++)
        {
            arr[i]=0;
        }
    }
        
    Array(Array& c){
        this->size = c.size;
        this->arr = new int [this->size];
        for(int i=0; i<c.size; i++){
            this->arr[i] = c.arr[i];
        }
    }
    int getSize(){
        return size;
    }

    int& operator[](int index){
        return arr[index];
    }

    int operator!(){
        return !(*this);
    }

    ~Array(){
        cout<<"DTOR CALLED\n";
        delete [] arr;
    }

    friend istream& operator>>(istream& is, Array& arr);
    friend ostream& operator<<(ostream& os, Array& arr);   

};

istream& operator>>(istream& is, Array& arr){

    for(int i=0; i<arr.getSize(); i++){
        is>>arr[i];
    }
    return is;
}
ostream& operator<<(ostream& os, Array& arr){

    for(int i=0; i<arr.getSize(); i++){
        os<<arr[i]<<" ";
    }
    return os;
}

int main(){ 
    int s;
    cout<<"Enter size\n";
    cin>>s;

    Array a1;
    
    Array a2(s);

    Array a3(a2);
    cout<<"Elements of a3\n"<<a3<<endl;

    cout<<"Enter the elements for a1\n";
    cin>>a1;
    cout<<"Elements of a1\n"<<a1<<endl;

    cout<<"3rd Element 3 of a2: "<<a2[3]<<endl;
    
    cout<<"Not of ELement 3 of a3: "<<!(a3[3])<<endl;
    
}