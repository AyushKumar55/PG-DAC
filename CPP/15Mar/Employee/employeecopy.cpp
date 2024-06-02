#include<iostream>
using namespace std;

class EmpArray
{
	private:
		int *data;
		int size;
	public:
		EmpArray(int s)
		{
			size = s;
			data = new int[size];
		}


		EmpArray(const EmpArray& src)
		{
			this->size=src.size;

			this->data=new int[this->size];

			for(int i=0;i<src.size;i++)
			{
				this->data[i]=src.data[i];
			}
		}
		
		int getAtIndex(int index)
		{
			return data[index];
		}

 		void setAtIndex(int index, int value)
 		{
 			data[index]=value;
 		}

		~EmpArray()
		{
			cout<<"\n Destructor Called";
			cout<<"\n Free up memory at "<<data;
			delete [] data;
		}

};

int main()
{
	EmpArray a(2);
	a.setAtIndex(0,100);
	a.setAtIndex(1,200);
	cout<<"\n Value="<<a.getAtIndex(0);

	EmpArray b=a;
	cout<<"\n Value="<<b.getAtIndex(0);

	EmpArray c(a);
	cout<<"\n Value="<<b.getAtIndex(0);
	cout<<"\n Program exiting"<<endl;
	return 0;
}
