#include <bits/stdc++.h>
#include <iostream>
using namespace std;
int type(int n, int *a)
{
	int e = 0, odd = 0;
	for (int i = 0; i < n; ++i)
	{
		if (a[i] % 2 == 0)
		{
			e++;
		}
		else
			odd++;
	}
	if (odd > 0 && e == 0)
	{
		return 2;
	}
	else if (e > 0 && odd == 0)
	{
		return 1;
	}
	else
		return 3;
}
int main()
{
	int n, temp;
	cin >> n;
	cout << "Enter the number of elements in the array" << endl;
	int a[n];
	cout << "Enter the elements in the array" << endl;
	for (int i = 0; i < n; i++)
	{
		cin >> a[i];
	}
	temp = type(n, a);

	if (temp == 2)
	{
		cout << "The array is Odd";
	}
	if (temp == 1)
	{
		cout << "The array is Even";
	}
	if (temp == 3)
	{
		cout << "The array is Mixed";
	}
}
