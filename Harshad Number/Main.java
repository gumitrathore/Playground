#include <iostream>
using namespace std;

int main() 
{
   int n,sum=0,temp;
  cin>>n;
  temp = n;

  while(temp>0)
  {
   sum += temp%10;
   temp=temp/10;
  
  }
  
 if(n%sum == 0)
  cout << "Harshad Number";
 else 
   cout << "Not Harshad Number";
    return 0;
}