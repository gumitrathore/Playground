#include <bits/stdc++.h>
#include <iostream>
using namespace std;

int main()
{
// Try out your code here
	int n;
	//float ;
	cin >> n;
	//cout << f << " ";
	for (int i = 1; i <= 8; i++)
	{
		if (i <= 4)
		{
			for (int j = 0; j < i; j++)
			{
				cout << n;
			}
			n++;
		}
		if (i > 4)
		{
			n--;
			for (int j = 8; j >= i; j--)
			{
				cout << n;
			}
		}
		cout << endl;

	}

}