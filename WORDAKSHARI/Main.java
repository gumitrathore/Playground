#include <bits/stdc++.h>
#include <iostream>
using namespace std;

int main()
{
	string str, front, last;
	getline(cin, str);
	cout << str << endl;
	while (str != "####")
	{
		last = str.back();
		getline(cin, str);
		front = str.front();
		if (last == front)
		{
			cout << str << endl;
		}
		else
			break;
	}

}
