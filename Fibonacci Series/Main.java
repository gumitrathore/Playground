#include <bits/stdc++.h>
#include <iostream>
using namespace std;

int feb(int n)
{
	int f = n;
	if (n == 1)
	{return 0;}
	if (n == 2)
	{return 1;}
	else
		return feb(n - 1) + feb(n - 2);
}
int main()
{
	int n;
	cin >> n;
	cout <<"The term "<<n<<" in the fibonacci series is "<< feb(n);
}
