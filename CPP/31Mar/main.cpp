//Vector of Student Objects

#include "Student.h"

void searchRoll(vector<Student>& v){

//USING find_if FUNCTION
 
/* REFERENCE
std::vector<Type> v = ....;
std::string myString = ....;
auto it = find_if(v.begin(), v.end(), [&myString](const Type& obj) {return obj.getName() == myString;})

if (it != v.end())
{
  // found element. it is an iterator to the first matching element.
  // if you really need the index, you can also get it:
  auto index = std::distance(v.begin(), it);
}
*/
	
	int fRoll = 0;
	cout<<"Enter the roll to be searched\n";
	cin>>fRoll;
	auto it = find_if(v.begin(), v.end(), [fRoll] (Student& s) {
		return s.getRoll() == fRoll;
		});

	if (it != v.end()){
		cout<<"Roll No. FOUND\n";
		it->display();}
	else
		cout<<"Roll No. NOT FOUND\n";
}

/*
//Using ITERATOR
void searchRoll(vector<Student>& v){

	vector<Student>::iterator it = v.begin();
	int flag=0;
	while(it != v.end()){
		if(it->getRoll() == fRoll){
			flag=1;
			(*it).display();
		}setName(newName)
	it++;
	}

	if(flag==1)
		cout<<"ROLL NO. FOUND\n";
	else
		cout<<"ROLL NO. NOT FOUND\n";
}
*/

//USING find_if FUNCTION
void updateName(vector<Student>& v){
	int updateRoll = 0;
	string newName = "";
	cout<<"Enter the roll of which you want to change the name: ";	
	cin>>updateRoll;
	cin.get();
	cout<<"Enter the newName\n";
	getline(cin,newName);
	
	auto it = find_if(v.begin(), v.end(), [updateRoll](Student& s){
		return s.getRoll()==updateRoll;
	});
	if(it != v.end())
		it->setName(newName);
	else
		cout<<"Roll NOT FOUND\n";
}
/*
Uisng ITERATOR
void updateName(vector<Student>& v){
	vector<Student>::iterator it = v.begin();
	int flag = 0;
	while(it != v.end()){
		if(it->getRoll() == updateRoll){
			(*it).setName(newName);
		}
		(*it).display();
	it++;
	}
}
*/

void sortByRoll(vector<Student>& v){
	sort(v.begin(),v.end());
	cout<<"Sorted Student Record\n";
	for(auto& Student : v) {
	Student.display();
	}
}

int main(){
	vector<Student> v;
	Student s;
	int choice;
	vector <Student>::iterator it = v.begin();

	do{
	cout<<"Hello!\nPress 1 to Enter Student Record\n";
	cout<<"Press 2 to Display Student Record\n";
	cout<<"Press 3 to Search By Roll No.\n";
	cout<<"Press 4 to Update Name w.r.t Roll No.\n";
	cout<<"Press 5 to Sort the Student Record by Roll No.\n";
	cout<<"Press 0 to EXIT\n";
	
	cin>>choice;
	switch(choice){
		case 1: 
			char ch;
			do{
				s.accept();
				v.push_back(s);
				cout<<"Enter Y to Add More Data while N to Stop\n";
				cin>>ch;
			} while(ch=='Y');
			break;
		
		case 2: 
			if (!v.empty()) {
				while(it != v.end()){
				it->display();
				it++;
				}
			}
			break;
		
		case 3: 
			searchRoll(v);
			break;
		
		case 4: 
			updateName(v);
			break;
		
		case 5:
			sortByRoll(v);
			break;
		
		default:
			if(choice == 0)
				cout<<"THANK YOU!!!\n";
			else
				cout<<"INVALID CHOICE\n";
		}
	}while(choice != 0);
}
