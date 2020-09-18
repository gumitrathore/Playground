#include <bits/stdc++.h>
#include <iostream>
using namespace std;

int main()
{
// Try out your code here
	int n, f = 11;
	//float ;
	cin >> n;
	cout << f*f << " ";
	for (int i = 1; i < n; i++)
	{
		f += 4;
		cout << f*f << " ";
	}

}