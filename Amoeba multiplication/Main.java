#include <iostream>
using namespace std;

int main() 
{
   // Try out your code here
  int n,t1=0,t2=1,nt;

cin>>n;
  for(int i = 1;i<=n;i++)
  {
     if(i == 1)
        {
            nt = 0;
            //continue;
        }
        if(i == 2)
        {
            nt = 1;
            //continue;
        }
    	if(i>2){
   		nt = t1+t2;
   	 	t1 = t2;
    	t2 = nt;
        }
    
  }
   cout<<nt;
}