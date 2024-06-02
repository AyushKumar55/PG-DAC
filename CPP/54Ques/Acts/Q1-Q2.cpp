//Lab Exam Practice Paper Solution
//Sorry! I don't have the question paper, please check the options in do-while loop.
 
#include <iostream>
#include <cstring>
using namespace std;

class Mobile
{
    int mobile_id;
    char *name;
    int quantity;
    double price;

public:
    Mobile()
    {
        mobile_id = 0;
        name = new char[50];
        strcpy(name, "Null");
        quantity = 0;
        price = 0.0;
    }

    Mobile(int m, char *n, int q, double p)
    {
        mobile_id = m;
        name = new char(strlen(n) + 1);
        strcpy(name, n);
        quantity = q;
        price = p;
    }

    Mobile(Mobile &src)
    {
        this->mobile_id = src.mobile_id;
        this->name = new char(strlen(src.name) + 1);
        this->name = strcpy(this->name, src.name);
        this->quantity = src.quantity;
        this->price = src.price;
    }

    void accept()
    {
        cout << "Enter Mobbile Id: ";
        cin >> mobile_id;
        cout << "Enter Mobile Name: ";
        cin.get();
        cin.getline(name, 50);
        cout << "Enter Quantity: ";
        cin >> quantity;
        cout << "Enter Price: ";
        cin >> price;
    }

    void display()
    {
        cout << "Id - " << mobile_id;
        cout << ", Name - " << name;
        cout << ", Quantity - " << quantity;
        cout << ", Price -  " << price << endl;
    }

   
};

int main()
{

    Mobile m[5];
    int size=0;
    int index = 0;
    int choice = 0;
    do
    {
        cout << "\nOptions:\n1. Accept Mobile Details\n2. Delete Mobile Details\n";
        cout << "3. Display Mobile Details\n0. Exit\nEnter your choice\n";
        cin >> choice;
        switch (choice)
        {
        case 1:
        {

            if (size < 5)
            {
                for (index=size; index <5; index++)
                {
                    cout<<"\nSerial No.: "<<(index+1)<<endl;
                    m[index].accept();
                }
                size=5;
            }
            else
                cout << "Only 10 Mobile Details allowed.\n";
        }
        break;


        case 2:
        {
            int d;
            cout << "Enter serail number to delete mobile: ";
            cin >> d;
        
            m[d-1].display();
            char ch;
            cout<<"Are you sure you want to delete this data?\nPress Y to DELETE\n";
            cin>>ch;
            if(ch == 'Y')
            {
            for (; d < (5); d++)
                m[d-1] = m[d];
            size--;
            cout<<"Data deleted ";
            }
            else
            cout<<"Data not deleted";
        }
        break;

        case 3:
        {

            //if(index > 0)
            //{

            cout << "\nAll Mobile Details\n";
            
            for (int i=0; i<size; i++)
            {
                cout << (i + 1) << ". ";
                m[i].display();
            }
            //}
           // else
         
            //cout<<"No DATA found";
        }
        break;

        case 0:
            cout<<"Thank You !!!...Terminating the program...\n";
        break;

        default:
            cout<<"INVALID CHOICE !!!";
        break;
        }
    } while (choice);

    return 0;
}