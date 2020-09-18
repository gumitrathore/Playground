#include <bits/stdc++.h>
#include <iostream>
using namespace std;
int printresult(int *a, int n, int v)
{
	int sum = 0;
	for (int i = 0; i < n; ++i)
	{
		sum += a[i];
	}
	if (sum <= v)
	{
		cout << "YES";
	}
	else
		cout << "NO";
}
int main()
{
	int n, v;
	cin >> n >> v;
	int a[n], result;
	for (int i = 0; i < n; i++)
	{
		cin >> a[i];
	}
	printresult(a, n, v);
	return 0;
}
