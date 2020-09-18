#include <iostream>
using namespace std;

int main() 
{
   // Try out your code here
  	int n,p=0,np=0;
  	cin>>n;
  	for(int i = 1;i<=n;i++)
    {
    	if(n%i == 0)
          np++;
    }
  	if(np == 2)
    cout << "Eligible";
    else
      cout << "Not eligible";
    return 0;
}