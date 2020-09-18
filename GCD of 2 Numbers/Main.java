#include <bits/stdc++.h>
#include <iostream>
using namespace std;

int gcd(int f, int s, int &small)
{
	if (small == 1)
	{
		return 1;
	}
	if (f % small == 0 && s % small == 0)
	{
		return small;
	}
	else if (small > 1)
	{
		gcd(f, s, --small);
	}

}
int main()
{
int f, s;
	cin >> f >> s;
	int small;
	if (f > s)
	{small = s;}
	else
	{small = f;}
	cout <<"G.C.D of "<<f<<" and "<<s<<" = "<< gcd(f, s, small);
}
