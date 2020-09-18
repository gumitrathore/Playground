#include <bits/stdc++.h>
#include <iostream>
using namespace std;

int pow(int b, int &p)
{
	if (p == 0)
	{return 1;}
	if (p == 1)
	{return b;}
	else
		return pow(b, --p) * b;
}
int main()
{
	int b, p,temp;
   	cout<<"Enter the value of a"<<endl<<"Enter the value of n"<<endl;
	cin >> b >> p;
  	temp = p;
	cout <<"The value of "<<b<<" power "<<temp<<" is "<< pow(b, p);
}
