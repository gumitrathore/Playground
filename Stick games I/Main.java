#include<iostream>
using namespace std;
int main()
{
	int r, c, t;
	cin >> r >> c;
 	t = r * c;
	if (r == 1 || c == 1)
	{
		cout << "Arun Gupta";
	}
	
   else
	if (t % 2 == 0)
	{
		cout << "Mani Iyer";
	}
	else
		cout << "Arun Gupta";

}