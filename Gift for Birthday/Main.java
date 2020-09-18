#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int x;
  cin>>x;
  if(x%4==0)
  {
  	if(x%400==0)
    {
      if(x%100==0)
        cout<<x<<" is not a leap year";
      else
         cout<<x<<" is a leap year";
    }
    
      else
         cout<<x<<" is a leap year";
  }
  else
    	cout<<x<<" is not a leap year";
}