#include <bits/stdc++.h>
#include <iostream>
using namespace std;

int main()
{
	// Try out your code here
	int n, f = 1, temp = 0;
	//float ;
	cin >> n;
	//cout << f << " ";
	for (int i = 1; i <= n; i++)
	{
		if (i % 2 == 0)
		{
			temp = f * f - 2;

		}
		else
			temp = f * f - 1;
		cout << temp << " ";
		f++;

	}

}