#include <iostream>
#include <stdlib.h>
#include <iomanip>

using namespace std;

int main(){

    int distperc;
    double combgast, consmed;

    cin >> distperc;
    cin >> combgast;

    consmed = distperc / combgast;

    cout << fixed << setprecision(3) << consmed << " km/l" << endl;

    system("pause");
    return 0;
}
