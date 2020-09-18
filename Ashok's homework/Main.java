#include <bits/stdc++.h>
#include <iostream>
using namespace std;


int main()
{
	int r, c;
	cin >> r >> c;
	int a[r][c];
	for (int i = 0; i < r; i++)
	{
		for (int j = 0; j < c; j++)
		{
			cin >> a[i][j];
		}
	}
	int b[r][c];
	for (int i = 0; i < r; i++)
	{
		for (int j = 0; j < c; j++)
		{
			cin >> b[i][j];
		}
	}
	int sum[r][c];
	for (int i = 0; i < r; i++)
	{
		for (int j = 0; j < c; j++)
		{
			sum[i][j] = a[i][j] + b[i][j];
		}
	}

	for (int i = 0; i < r; i++)
	{
		for (int j = 0; j < c; j++)
		{
			cout << sum[i][j] << " ";
		}
		cout << endl;
	}

}
