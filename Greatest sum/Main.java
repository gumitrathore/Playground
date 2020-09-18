#include <bits/stdc++.h>
#include <iostream>
using namespace std;
int maximum(int *m, int n)
{
	int max = 0, temp = 1;
	max = m[0];
	for (int i = 1; i < n; ++i)
	{
		if (max < m[i])
		{
			max = m[i];
			temp++;
		}
	}
	return temp;
}
int main()
{
	int r, c, max = 0;
	std::cin >> r >> c;
	int a[r][c], maxc[c], maxr[r];
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
	cout << "Sum of rows is ";
	for (int i = 0; i < r; ++i)
	{
		cout << maxr[i] << " ";
	}
	cout << endl << "Row " << maximum(maxr, r) << " has maximum sum" << endl;
	for (int j = 0; j < c; j++)
	{
		int sumc = 0;
		for (int i = 0; i < r; ++i)
		{
			sumc += a[i][j];
		}
		maxc[j] = sumc;
	}
	cout << "Sum of columns is ";
	for (int i = 0; i < c; ++i)
	{
		cout << maxc[i] << " ";
	}
	cout << endl << "Column " << maximum(maxc, c) << " has maximum sum";
}
