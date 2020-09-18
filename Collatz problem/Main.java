#include<iostream>
using namespace std;
int main()
{
	//Type your code here.
	int n,temp, count = 0;
	cin >> n;
	temp = n;
  if (n == 1)
		{
			cout <<n<< endl;			
		}
else if (n>1){
	while (temp >= 1)
	{
		cout << temp << endl;
		if (temp % 2 == 0)
		{
			temp /= 2;
		}
		else if(temp != 1)
		{
			temp = 3 * temp + 1;
		}
		if(temp==1)
  		{
          cout<<temp<<endl;
          count++;
      	break;
  		}

		count++;
	}
}
	
	cout << count;
}