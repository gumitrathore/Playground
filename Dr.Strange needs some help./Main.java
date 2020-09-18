#include <bits/stdc++.h>
#include <iostream>
using namespace std;
int exp(int m, int n)
{
	int mul;
	mul = pow(m, n);
	return mul;
}
int main()
{
	// Try out your code here

	int m, n, req, store;

	cin >> m >> n >> req;
	store = exp(m, n);
	if (store >= req)
	{
		cout << "Doctor, you can proceed with your experiment."; /* code */
	}
	else
		cout << "Sorry Doctor! You need more bacteria.";
}
