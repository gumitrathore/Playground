#include <bits/stdc++.h>
#include <iostream>
using namespace std;

int main()
{
	string si;
	getline(cin, si);

	for (auto i = si.crbegin(); i < si.crend(); ++i)
	{
		cout << *i;
	}
}
