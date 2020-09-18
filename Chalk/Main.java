#include <iostream>
#include <cmath>
#include <math.h> 
using namespace std;

int main() 
{
   // Try out your code here
  int chalk,days;
  float tchalk;
  float x;
  cin>>chalk;//16
  tchalk = chalk;
  //cout<<tchalk<<endl;
  days = chalk;//16
  x = 1/(sqrt(chalk));
  //cout<<x<<endl;// .25
  while(tchalk>0)
  { 
   // if(chalk == 0)
  	tchalk = (tchalk*x);
    //cout<< tchalk<<endl;
  	days += (tchalk); 
  }
  cout<<days;
}