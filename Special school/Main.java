#include <bits/stdc++.h>
#include <iostream>
using namespace std;

int main()
{
	string f, s, temp;
	getline(cin, f);
	getline(cin, s);

	for (auto i = f.rbegin(); i < f.rend(); ++i)
	{
		temp += *i;
	}

	if (temp == s)
	{
		cout << "It is correct";
	}
	else
		cout << "It is wrong";

}
