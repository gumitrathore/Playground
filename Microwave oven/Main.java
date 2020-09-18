#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  //Type your code here.
  int item;
  float heat;
  cin>>item>>heat;
  switch(item)
  {
    case 1:
      	cout<<fixed<<setprecision(2)<<heat;
   			break;
    case 2:
      cout<<fixed<<setprecision(2)<<heat*1.5;
   			break;
    case 3:
      cout<<fixed<<setprecision(2)<<2*heat;
   			break;
      default :
      	cout<<"Number of items is more";
  }
  
    
  
}