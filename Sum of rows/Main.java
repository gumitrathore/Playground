#include <bits/stdc++.h>
#include <iostream>
using namespace std;

int main()
{
	int r, c, max = 0;
	std::cin >> r >> c;
	int a[r][c], maxr[r];
	for (int i = 0; i < r; i++)
	{
		for (int j = 0; j < c; ++j)
		{
			cin >> a[i][j];
		}
	}
	for (int i = 0; i < r; i++)
	{
		int sumr = 0;
		for (int j = 0; j < c; ++j)
		{
			sumr += a[i][j];
		}
		maxr[i] = sumr;
	}
	for (int i = 0; i < r; ++i)
	{
		cout << maxr[i] << endl;
	}
}
