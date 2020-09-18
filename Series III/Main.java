#include <bits/stdc++.h>
#include <iostream>
using namespace std;

int main()
{
// Try out your code here
	int n, f = 6;
	//float ;
	cin >> n;
	cout << f << " ";
	for (int i = 1; i < n; i++)
	{
		f += (5 * i);
		cout << f << " ";
	}

}