#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int i, j, m;
  cin >> i >> j >> m;
  if (m >= i + 1 && m <= 2 * i) 
    cout << "It is a mango tree";
  else if (m >=i*(j - 2) && m <= i*(j - 1))
    cout << "It is a mango tree";
  else
    cout << "It is not a mango tree";
}