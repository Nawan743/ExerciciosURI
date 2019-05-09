#include <iostream>
#include <stdlib.h>
#include <iomanip>

using namespace std;

int main(){

    int cod1, num1, cod2, num2;
    double valor1, valor2, total;

    cin >> cod1;
    cin >> num1;
    cin >> valor1;
    cin >> cod2;
    cin >> num2;
    cin >> valor2;

    total = valor1*num1 + valor2*num2;

    cout << "VALOR A PAGAR: R$ " << fixed << setprecision(2) << total << endl;

    system("pause");
    return 0;
}
