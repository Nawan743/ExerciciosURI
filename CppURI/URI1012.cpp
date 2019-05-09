#include <iostream>
#include <stdlib.h>
#include <iomanip>
#include <math.h>

using namespace std;

int main(){

    double A, B, C, tri, circ, trap, quad, ret, pi=3.14159;

    cin >> A;
    cin >> B;
    cin >> C;

    tri = A * C / 2;
    circ = pi * pow(C, 2);
    trap = (A+B)*C / 2;
    quad = pow(B, 2);
    ret = A * B;

    cout << fixed << setprecision(3);
    cout << "TRIANGULO: " << tri << endl;
    cout << "CIRCULO: " << circ << endl;
    cout << "TRAPEZIO:  " << trap << endl;
    cout << "QUADRADO: " << quad << endl;
    cout << "RETANGULO: " << ret << endl;

    system("pause");
    return 0;
}
