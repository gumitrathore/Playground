/* C++ program for diamond pattern printing using numbers and stars */

#include <iostream>

using namespace std;

int main()

{

    int i, j, n ;



    cin >> n;

    for (i = 1; i <= n; i++)

    {

        for (j = 1; j <= i; j++)

        {

            if (j < i)

                cout << i << "*";

            else

                cout << i;

        }

        cout << endl;

    }

    //i = i - n;

    for (i = n; i >= 1; i--)

    {   for (j = 1; j <= i; j++)

        {

            if (j < i)

                cout << i << "*";

            else

                cout << i;

        }

        //  i = (i + 1) - 2 * i;

        cout << endl;

    }

    return 0;

}