#include <bits/stdc++.h>
#include <iostream>
using namespace std;

int main()
{
	// Try out your code here
	int n, r, odd = 0, even = 0;
	//float marks;
	cin >> n;

	while (n > 0)//143 14 1
	{

		if (n >= 10)
		{
			r = n % 10;//3 4
			//if (r == 0)
			//{break;}
			if (r % 2 == 0)
			{
				even += r;//4
			}
			else
				odd += r;//3
		}
		else if (n < 10)
		{
			if (n % 2 == 0)
			{
				even += n;
			}
			else
				odd += n;//4
		}
		n = n / 10;
	}
	if (odd == even)
	{
		cout << "Yes";
	}
	else
		cout << "No";
}