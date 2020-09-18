#include <bits/stdc++.h>
#include <iostream>
using namespace std;
int power(int m, int n)
{
	int j, i;
	for (i = 1, j = 1; i <= n; i++)
		j = j * m;
	return j;
}
int arm(int n)
{
	int count = 0, m, sum = 0;
	int i = n;
	while (i != 0)
	{
		i = i / 10;
		++count;
	}
	int j = n;
	while (j != 0)
	{

		m = j % 10;
		j = j / 10;
		sum += power(m, count);
	}
	if (sum == n)
		return 1;
	else
		return 0;
	//Your code goes here
}
int main()
{
	int n;
	std::cin >> n;
	if (arm(n) == 1)
		cout << "Kindly proceed with encrypting";
	else
		cout << "It is not an Armstrong number";
}
