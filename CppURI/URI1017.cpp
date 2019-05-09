#include <iostream>
#include <stdlib.h>
#include <iomanip>

using namespace std;

int main(){

    int tempgast, velmed;
    double quantgast;

    cin >> tempgast;
    cin >> velmed;

    quantgast = (velmed / 12.0) * tempgast;

    cout << fixed << setprecision(3) << quantgast << endl;

    system("pause");
    return 0;
}
