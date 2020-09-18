#include <bits/stdc++.h>
#include <iostream>
using namespace std;

int main()
{
	int r, sum1 = 0, sum2 = 0;
	cin >> r;

	int a[r][r];

	for (int i = 0; i < r; i++)
	{
		for (int j = 0; j < r; ++j)
		{
			cin >> a[i][j];
		}

	}

	for (int i = 0; i < r; i++)
	{
		sum1 += a[i][i];

		sum2 += a[i][r - 1 - i];

	}
	if (sum1 == sum2)
	{
		cout << "Yes";
	}
	else
		cout << "No";

}
