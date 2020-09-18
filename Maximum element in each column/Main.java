#include <bits/stdc++.h>
#include <iostream>
using namespace std;

int main()
{
	int r, c, max = 0;
	std::cin >> r >> c;
	int a[r][c];
	for (int i = 0; i < r; i++)
	{
		for (int j = 0; j < c; ++j)
		{
			cin >> a[i][j];
		}
	}



	for (int j = 0; j < c; j++)
	{
		for (int i = 0; i < r - 1; ++i)
		{
			max = a[i][j]; //4
			if (max < a[i + 1][j])
			{
				max = a[i + 1][j];
			}
		}
		cout << max << endl;
	}

}
