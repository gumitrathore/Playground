#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int age,born,cy;
  cin>>born>>cy;
  age=(100-born)+cy;
  if(age>=100)
  {
	cout<<age-100;  
  }
  else 
    cout<<age;
  
}