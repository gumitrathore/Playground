#include <bits/stdc++.h>
#include <iostream>
using namespace std;

int main()
{
	int n, o = 0, e = 0;
	cin >> n;
	int a[n];
	for (int i = 0; i < n; i++)
	{
		cin >> a[i];
	}

	for (int i = 0; i < n; ++i)
	{
		if (a[i] % 2 == 0)
		{
			e += a[i];
		}
		else
			o += a[i];
	}
	cout <<"The sum of the even numbers in the array is "<< e << endl<<"The sum of the odd numbers in the array is " << o;


}
