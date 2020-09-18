#include <bits/stdc++.h>
#include <iostream>
using namespace std;

int main()
{
	// Try out your code here
	int n;
	float f = 0.5;
	cin >> n;
	cout << f << " ";
	for (int i = 1; i < n; i++)
	{
		f *= 3;
		cout << f << " ";
	}

}