#include <bits/stdc++.h>
#include <iostream>
using namespace std;

int digitsum(int n)//88 8
{
	int sum = 0 ;


	if (n == 0)
	{return 0;}//8
	else
		sum += n % 10 + digitsum(n / 10); //8
	return sum % 10 + digitsum(sum / 10);
}
int main()
{
	int n;
	cin >> n;
	cout << digitsum(n);
}
