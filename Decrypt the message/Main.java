#include <iostream>
using namespace std;

int main() 
{
   // Try out your code here
  int e,t,c,sum=0;
  cin>>e>>t;
  c=e+t;
  for(int i = 1;i<=(c/2);i++)
  {
	if(c%i == 0){
    sum+=i;
    }  
  }
  if(sum == c) 
  cout <<"They can read the message";
  else
  cout <<"They can't read the message";
    return 0;
}