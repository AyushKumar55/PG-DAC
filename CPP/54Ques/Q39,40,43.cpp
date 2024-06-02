#include<iostream>
using namespace std;

class Complex{
    private:
    int real;
    int imaginary;
    

    public:
    static int count;

    Complex():real(0),imaginary(0)
    {
        ++count;
    }

    Complex operator+(const Complex& src)const{
        Complex sum;
        sum.real = real + src.real;
        sum.imaginary = imaginary + src.imaginary;
        return sum;
    }

    Complex operator-(const Complex& src)const{
        Complex sub;
        sub.real = real - src.real;
        sub.imaginary = imaginary - src.imaginary;
        return sub;
    }

    const Complex& operator=(const Complex& src){
        real=src.real;
        imaginary=src.imaginary;
        return *this;
    }

    bool operator==(const Complex& src)const{
        return (real==src.real && imaginary==src.imaginary);
    }
    
    bool operator!=(const Complex& src)const{
        return !((*this)==src);
    }

    const Complex& operator++(){
        ++real;
        return *this;
    }
    Complex operator++(int){
        Complex a= *this;
        ++real;
        return a;
    }

    int getReal()const{
        return real;
    }
    int getImaginary()const{
        return imaginary;
    }
    void setReal(int i, int j){
        this->real = i;
        this->imaginary = j;
    }

    friend ostream& operator<<(ostream& os, const Complex& src);
    friend istream& operator>>(istream& is, Complex& src);

};

    ostream& operator<<(ostream& os, const Complex& src){
        return os<<"Real: "<<src.real<<" Imaginary: "<<src.imaginary<<endl;
    }

    istream& operator>>(istream& is, Complex& src){
        is >> src.real;
        is >> src.imaginary;
        return is;
    }

    int Complex::count = 0;

int main(){
    Complex c1, c2,c3, c4;
    cout<<"Enter two complex numbers\n";
    cin>>c1;
    cin>>c2;
    
    cout<<c1;
    cout<<c2;

    c1=c2;
    cout<<c1;

    cout<<(c1==c2)<<endl;
    cout<<"Enter third complex numbers\n";
    cin>>c3;
    cout<<c3+c2<<endl;
    
    cout<<c3-c1<<endl;

    cout<<(c2!=c1)<<endl;

    c4 = ++c1;

    cout<<c4<<endl;
    cout<<c1<<endl;

    c4=c1++;
    cout<<c4<<endl;
    cout<<c1<<endl;

    cout<<Complex::count<<endl;
    
}