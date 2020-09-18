#include <bits/stdc++.h>
#include <iostream>
using namespace std;

int main()
{
	// Try out your code here
	int target, n, count = 0, temp = 0;
	//float marks;
	cin >> target;

	while (temp < target)
	{
		cin >> n;
		if (n >= target)
		{
			count++;
			break;
		}
		else
			temp += n;
		count++;
	}
	cout<<"The number of turns is "<< count;

}