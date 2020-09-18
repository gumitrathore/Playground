#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int p,d;
  float m;
  cin>>m>>p>>d;
  p*=m;
  if(p>=d)
    cout<<"Can reach";
  else
    cout<<"Cannot reach";
}