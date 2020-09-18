#include<iostream>
using namespace std;
int main()
{
  int a,b,c;
  cin>>a>>b>>c;
  if(c%b==0 || c%b==1 || b>c)
    cout<<"Yes";
  else
    cout<<"No";
  return 0;
}