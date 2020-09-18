#include <bits/stdc++.h>
#include <iostream>
using namespace std;

int swap(int &f, int &s)
{
	int temp;
	temp = f;
	f = s;
	s = temp;
	return f, s;
}
int main()
{
	int f, s;
	cin >> f >> s;
	cout << "Before swapping a= " << f << " and b=" << s << endl;
	swap(f, s);
	cout << "After swapping a= " << f << " and b=" << s;
}
