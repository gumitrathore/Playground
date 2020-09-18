#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int fa,fd,fs,sa,sd,ss,aa,ad,as,ff,sf,af;
  cin>>fa>>fd>>fs>>sa>>sd>>ss>>aa>>ad>>as;
 // fa= fa-(((fd*fa)/100 )+fs);
  fd*=(fa/100);
  ff=fa-fd+fs;
  sd*=(sa/100);
  sf=sa-sd+ss;
  ad*=(aa/100);
  af=aa-ad+as;
  
  cout<<"In Flipkart Rs."<<ff<<endl<<"In Snapdeal Rs."<<sf<<endl<<"In Amazon Rs."<<af<<endl;
  
  	if(ff<af && ff<=sf)
      cout<<"He will prefer Flipkart";
  	else if(sf<ff && sf<af)
      cout<<"He will prefer Snapdeal";
  	else
      cout<<"He will prefer Amazon";
  
}