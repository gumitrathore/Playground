#include <iostream>
using namespace std;

int main() 
{
   int a,b,s;
  cin>>a>>b>>s;
  cout<<"Enter first number : Enter second number : Menu"<<endl<<"1.Addition"<<endl<<"2.Subtraction"<<endl<<"3.Multiplication"<<endl<<"4.Division"<<endl<<"5.Remainder"<<endl;
    switch(s){
    
    	
    case 1: cout<<a+b;
             break;
      case 2:cout<<a-b;
        	 break;
        case 3:cout<<a*b;
        	 break;
        case 4:cout<<a/b;
        	 break;
        case 5:cout<<a%b;
        	 break;
        default :
        	cout<<"Invalid operation";
    
    
    }
    return 0;
}