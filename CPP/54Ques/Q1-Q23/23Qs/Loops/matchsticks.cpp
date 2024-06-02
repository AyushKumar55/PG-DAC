/*
Write a program for matchstick game between the computer and the user.  
Your program should ensure that the computer always wins. 
Rules for the game are as follows:
a. There are 21 matchsticks
b. The computer asks the player to pick 1, 2, 3, or 4 matchsticks.
C. Player is given the chance to pick the sticks first then the computer picks the sticks.
d. Whoever is forced to pick up the last matchstick loses the game.
*/

#include <iostream>
using namespace std;

int main() {

    int n = 21, user, comp, rem = 0;
    cout<<"Welcome to the Matchsticks Game!\n";
    cout<<"There are 21 matchsticks\nPick 1, 2, 3, or 4 matchsticks.\n";
    cout<<"Now, Whoever is forced to pick up the last matchstick loses the game.\n";
    cout<<"ALL THE BEST !!\n\n";

    cout<<"Total Number of  matchsticks = "<<n<<endl;

    while(1){
        cout<<"Pick 1, 2, 3, or 4 matches\n";
        cin>>user;

        if(user>4 || user<1)
            continue;

        n -= user;
        cout<<"Remaining Matches = "<<n;

        comp = 5 - user;
        cout<<" out of which Computer picked "<<comp<<" matches\n";

        n -= comp;
        if(n==1){
            cout<<"Remaining Match = "<<n<<"\nYOU LOSE! WANNA TRY AGAIN?"<<endl;
            break;
        }   
        else
            cout<<"Remaining Matches = "<<n<<endl;
    }
}