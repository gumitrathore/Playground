#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int sun, mon, tue, wed, thu, fri, sat, temp, total;
  cin >> sun >> mon >> tue >> wed >> thu >> fri >> sat;
  temp =  mon + tue + wed + thu + fri;
  if (temp > 40) {
    temp = (temp - 40) * 25;
  }
  else
  {
    temp = 0;
  }
  if (mon > 8 && mon <=24)
  {
    mon = mon * 100 + (mon - 8) * 15;
  }
  else if (mon <= 8)
  {
    mon = mon * 100;
  }
  if (tue > 8 && tue <=24)
  {
    tue = tue * 100 + (tue - 8) * 15;
  }
  else if (tue <= 8)
  {
    tue = tue * 100;
  }
  if (wed > 8 && wed <=24)
  {
    wed = wed * 100 + (wed - 8) * 15;
  }
  else if (wed <= 8)
  {
    wed = wed * 100;
  }
  if (thu > 8 && thu <=24)
  {
    thu = thu * 100 + (thu - 8) * 15;
  }
  else if (thu <= 8)
  {
    thu = thu * 100;
  }
  if (fri > 8 && fri <=24)
  {
    fri = fri * 100 + (fri - 8) * 15;
  }
  else if (fri <= 8)
  {
    fri = fri * 100;
  }
  if (sat > 8 && sat <=24)
  {
    sat = sat * 125 + (sat - 8) * 15;
  }
  else if (sat <= 8)
  {
    sat = sat * 125;
  }
  if (sun > 8 && sun <=24)
  {
    sun = sun * 150 + (sun - 8) * 15;
  }
  else if (sun <= 8)
  {
    sun = sun * 150;
  }
  total = sun + mon + tue + wed + thu + fri + sat + temp;
  cout << total;
}