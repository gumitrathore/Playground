#include <iostream>
using namespace std;

int main() 
{
   // Try out your code here
  int fd,fc,sd,sc,temp,cent;
  cin>>fd>>fc>>sd>>sc;
  fd += sd;
  fc += sc;
  temp = fc/100;
  cent = fc%100;
  fd+=temp;
  cout<<fd<<endl<<cent;

  
}