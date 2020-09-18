#include <bits/stdc++.h>
#include <iostream>
using namespace std;

int main()
{
	int r, c, max = 0;
	cin >> r >> c;
   	if(r == 0 && c==0)
    {
      cout<<"0";
      return 0;
    }
	int a[r][c];
	for (int i = 0; i < r; i++)
	{
		for (int j = 0; j < c; ++j)
		{
			cin >> a[i][j];
		}
	}

	if (c == 1 || r == 1)
	{
		for (int i = 0; i < r; i++)
		{
			for (int j = 0; j < c; ++j)
			{
				cout << a[i][j] << endl;
			}
		}
	}
	else
		for (int i = 0; i < r; i++)
		{
			for (int j = 0; j < c - 1; ++j)
			{
              	if(j==0)
				max = a[i][j];
				if (max < a[i][j + 1])
				{
					max = a[i][j + 1];
				}
			}
			cout << max << endl;
		}
}
