#include <bits/stdc++.h>
#include <iostream>
using namespace std;

int main()
{
	int n;
	cin >> n;
	cout << "Enter the number of elements in the array" << endl;
	int a[n + 1];
	cout << "Enter the elements in the array" << endl;
	for (int i = 0; i <= n; i++)
	{
		if (i == n)
		{
			a[n] = 0;
		}
		else
			cin >> a[i];
	}
	cout << "Enter the location where you wish to insert an element" << endl;

	int pos, value, temp = 0;
	cin >> pos >> value;
	if (pos > n)
	{
		cout << "Invalid Input";
		return 0;
	}
	cout << "Enter the value to insert" << endl;
	for (int i = pos; i <= n + 1; i++)
	{
		temp = a[i - 1];
		a[i - 1] = value;
		value = temp;
	}
	cout << "Array after insertion is" << endl;
	for (int i = 0; i < n + 1; ++i)
	{
		cout << a[i] << endl;
	}



}
