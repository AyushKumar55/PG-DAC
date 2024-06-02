
#include "Employee.h"
#include "Util.h"

using namespace std;

void sortBySalary(Employee *arr, int n){
	int i,j;
	Employee temp;
	for(int i=0; i<n; i++){
		for(int j=i+1; j<n; j++){
			if(arr[i].getSalary()>arr[j].getSalary()){
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
	}
}
