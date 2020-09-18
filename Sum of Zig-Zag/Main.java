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
	int sumr = 0;
	for (int i = 0; i < r; i++)
	{
		sumr += a[i][r - 1 - i];
		for (int j = 0; j < c; ++j)
		{
			if ((i == 0 && j != c - 1) || (i == r - 1 && j != 0))
			{
				sumr += a[i][j];
			}
		}
	}

	cout<<"Sum of Zig-Zag pattern is "<< sumr;

}
