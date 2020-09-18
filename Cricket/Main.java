#include<iostream>
using namespace std;
float round(float var) 
{ 
	// 37.66666 * 100 =3766.66 
	// 3766.66 + .5 =3767.16 for rounding off value 
	// then type cast to int so value is 3767 
	// then divided by 100 so the value converted into 37.67 
	float value = (int)(var * 10 + .5); 
	return (float)value / 10; 
} 
int main()
{
  //Type your code here.
  int tballs,truns,run,ball,tover;
	float over,trr,crr;
  cin>>tballs>>truns>>run>>ball;
  tover=50;
  over=(ball/6+(ball%6)*0.1);
  crr=(run/over);
  trr=(float)truns/tover;
  cout<<tover<<endl<<over<<endl<<round(crr)<<endl<<round(trr)<<endl;
  if(crr>trr)
    cout<<"Eligible to Win";
  else
   cout<<"Not Eligible to Win";
  
}