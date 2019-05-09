#include <iostream>
#include <stdlib.h>
#include <math.h>
#include <iomanip>

using namespace std;

int main()
{
    double area, raio, n = 3.14159;

    cin >> raio;
    area = n * pow(raio, 2);

    cout << fixed << setprecision(4);
    cout << "A=" << area << endl;

    system("pause");
    return 0;
}
