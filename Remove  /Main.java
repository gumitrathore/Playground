#include <bits/stdc++.h>
#include <iostream>
using namespace std;

int main()
{
	string str;
	int pos;
	getline(cin, str);

	pos = str.find("the");

	while (pos != -1)
	{
		str.erase(pos, 4);
		pos = str.find("the");
	}

	cout << str;
}
