#include <bits/stdc++.h>
#include <iostream>
using namespace std;

int main()
{
	// Try out your code here
	int n, odd = 0, even = 0, negative = 0;
	//float marks;
	cin >> n;

	do
	{

		if (n < 0)
		{break;}
		if (n >= 0)
		{
			if (n % 2 == 0)
			{
				even++;
				cin >> n;
			}
			else
			{
				odd++;
				cin >> n;
			}

			if (odd == 3)
			{break;}
		}

	} while (n >= 0);
	if (n < 0)
	{cout << "-1.5";}

	if (even > 0 && odd == 3)
	{cout << "2.0";}
	if (odd == 3 && even == 0)
	{
		cout << "3.0";
	}


}