#include <iostream>
using namespace std;

int main()
{
    int n;
    cin >> n;

    for (int i = 1; i <= n; i++)
    {
        int a = 65;

        for (char j = 1; j <= n; j++)
        {
            cout << char(a) << "  ";
            a = a + 1;
        }
        a = a + n;

        cout << endl;
    }
}