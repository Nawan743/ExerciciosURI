#include <iostream>
#include <stdlib.h>
#include <iomanip>
#include <math.h>

using namespace std;

int main(){

    double pi = 3.14159, volume, R;

    cin >> R;

    volume = 4.0/3  * pi * pow(R, 3);

    cout << "VOLUME = " << fixed << setprecision(3) << volume << endl;

    system("pause");
    return 0;
}
