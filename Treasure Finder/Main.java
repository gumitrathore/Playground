#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,c,hcf;
  cin>>a>>b>>c;
   int min = (a < b ? a : b);
min = (min < c ? min : c);

for( int i = min; i>0; i--)
{
if(a%i == 0 && b%i == 0 && c%i == 0)
{
  hcf = i;
  break;
  }
}
  
  if(a>b){
    	if(a<c)
          cout<<"The treasure is in box which has number "<<a;
  }
  if(a>c){
    	if(a<b)
           cout<<"The treasure is in box which has number "<<a;
  }
  if(b>a){
    	if(b<c)
           cout<<"The treasure is in box which has number "<<b;
    	
  }
  if(b>c){
    	if(b<a)
           cout<<"The treasure is in box which has number "<<b;
  }
  if(c>a){
    	if(c<b)
           cout<<"The treasure is in box which has number "<<c;
  }
  if(c>b){
    	if(c<a)
           cout<<"The treasure is in box which has number "<<c;
  } 
  cout<<endl<<"The code to open the box is "<<hcf;
}