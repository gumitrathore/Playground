#include <bits/stdc++.h>
#include <iostream>
using namespace std;

int fact(int &f)
{
	int fs = f;
	if (fs == 1)
	{return fs;}
	else
		return f * fact(--f);

}
int main()
{
	int f,s;
	cin >> f;
  	s = f;
	cout<< "The factorial of "<<s<<" is "<< fact(f);
}
