#include <bits/stdc++.h>
#include <iostream>
using namespace std;

int gcd(int f, int s, int t)
{
	int small = 0;
	if (f <= s && f <= t)
	{
		small = f;
	}
	if (s <= f && s <= t)
	{
		small = s;
	}
	if (t <= s && t <= f)
	{
		small = t;
	}

	while ( small >= 1)
	{
		if (f % small == 0 && s % small == 0 && t % small == 0)
		{
			return small;
		}
		small--;
	}
}
int main()
{// Try out your code here

	int f, s, t, r;
	cin >> f >> s >> t >> r;

	if (gcd(f, s, t) == r)
		cout << "Answer is correct.";
	else
		cout << "Answer is wrong.";
}
