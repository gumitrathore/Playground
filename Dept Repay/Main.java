#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  float d,fi,si;
  int p,r,t;
  	cin>>p>>r>>t;
  	si=(p*r*t)/100;
  	p+=si;
  	d=0.02*si;
  	fi=p-d;
  cout<<si<<endl<<p<<endl<<d<<endl<<fi;
  
}