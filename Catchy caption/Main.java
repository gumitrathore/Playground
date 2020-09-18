#include <bits/stdc++.h>
#include <iostream>
using namespace std;

int main()
{
	char str[100];
	int count = 0;
	char *pos;
	cin.getline(str, 100);
	pos = strchr(str, ' ');

	while (pos != NULL)
	{
		count++;
		pos = strchr(pos + 1, ' ');
	}
	if (count > 10)
	{
		cout << "Caption not eligible for the contest";
	}
	else
		cout << "Caption eligible for the contest";

}
