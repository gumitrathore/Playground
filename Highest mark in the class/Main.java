#include <bits/stdc++.h>
#include <iostream>
using namespace std;


int main()
{
	int n, h;
	cin >> n;
	int a[n];
	for (int i = 0; i < n; i++)
	{
		cin >> a[i];
	}
	h = a[0];
	for (int i = 1; i < n; i++)
	{
		if (h < a[i])
		{
			h = a[i];
		}
	}
	cout << h;

}
