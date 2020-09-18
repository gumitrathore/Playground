#include <iostream>
using namespace std;

int main() 
{
   // Try out your code here
   int n,rev=0,ld;
   cin>>n;
  	while(n>0){
    
    	ld = n%10;
       rev = (rev*10) + ld;
       n=n/10;
    
    }
    cout << rev;
    return 0;
}