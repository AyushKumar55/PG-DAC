#include<iostream>
#include<cstring>

using namespace std;

class Employee{
    int emp_id;
    char emp_name[20];
    double salary;

    public:
    Employee(){
        emp_id = 0;
        emp_name[0]='\0';
        salary = 0.0;
    }
    Employee(int id, char* name, double sal){
        emp_id=id;
        strcpy(emp_name, name);
        salary = sal;
    }
    void accept(){
        cout<<"Enter your Employee Id\n";
        cin>>emp_id;
        cout<<"Enter your Name\n";
        cin.get();
        cin.getline(emp_name,20);
        cout<<"Enter your Salary\n";
        cin>>salary;
    }

    void update(){
    char name[20];
    double sal;
    int choices;
    cout<<"Options:\n1. Update Name\n2. Update Salary\n3. Both\n";
    cin>>choices;
    if(choices==1){
        cout<<"Enter new name\n";
        cin.get();
        cin.getline(name,20);
        strcpy(this->emp_name, name);
        cout<<"Name Updated\n";
    }
    else if(choices==2){
        cout<<"Enter new salary\n";
        cin>>sal;
        this->salary = sal;
        cout<<"Salary Updated\n";
    }
    else if(choices==3){
        cout<<"Enter new name\n";
        cin.get();
        cin.getline(name,20);
        strcpy(this->emp_name, name);
        cout<<"Enter new salary\n";
        cin>>sal;
        this->salary = sal;
    }
    else
        cout<<"Invalid Choice\n";
}

    void display(){
        cout<<"Employee Details: "<<"Employee Id: "<<emp_id<<", Employee Name: "<<emp_name<<", Employee Salary: "<<salary<<endl;
    }

    int getId(){
        return emp_id;
    }
};



int main(){

    int n;
    cout<<"Enter the number of student's data\n";
    cin>>n;
    Employee e(1,"Ayush", 100000.0);
    e.display();
    Employee *emp = new Employee[n];
    int choice = 0;
    do{
        cout<<"Options:\n1. INSERT\n2. UPDATE\n3. DISPLAY ALL\n0. EXIT\n";
        cin>>choice;
        switch(choice){
            case 1:
            for(int i=0; i<n; i++)
                emp[i].accept();
            break;

            case 2:
            int id;
            cout<<"Enter Employee Id for updation\n";
            cin>>id;
            bool flag = false;
            for(int i=0; i<n; i++){
                if(emp[i].getId()==id){
                    emp[i].update();
                    flag = true;
                }
            }
            if(!flag)
                cout<<"Employee Id NOT FOUND\n";
            break;

            case 3:
            for(int i=0; i<n; i++)
                emp[i].display();
            break;

            case 0:
                cout<<"THANK YOU !!! TERMINATING THE APP\n";
            break;

            default:
                cout<<"INVALID CHOICE\n";
        }
    }while(choice!=0);
    return 0;
}