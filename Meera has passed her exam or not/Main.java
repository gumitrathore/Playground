#include <bits/stdc++.h>
#include <iostream>
using namespace std;


int main()
{
	int n, flag = 0;
	cin >> n;
	int a[n];
	for (int i = 0; i < n; i++)
	{
		cin >> a[i];
	}
	int r;
	cin >> r;
	for (int i = 0; i < n; i++)
	{
		if (r == a[i])
		{
			flag++;
		}
	}
	if (flag > 0)
	{
		cout << "She passed her exam";
	}
	else
		cout << "She failed";


}
