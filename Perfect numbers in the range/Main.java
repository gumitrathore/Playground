#include <iostream>
using namespace std;

int main() 
{
   // Try out your code here
  int s,e,c;
  cin>>s>>e;
  for(s;s<=e;s++)
  {
    int i = 1,sum=0;
    
    while(i<=(s/2))
    {
		//int x;
     //  x=s%i;
      if(s%i==0)
      {
      	sum+=i;
      }
      
   		 i++;
    }
    if(sum == s)
      cout<<s<<" ";
     
  }
}