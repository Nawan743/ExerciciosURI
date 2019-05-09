#include <iostream>
#include <stdlib.h>

using namespace std;

int main(){

    int nota100, nota50, nota20, nota10, nota5, nota2, nota1, quantnota;
    int resto;

    cin >> quantnota;

    nota100 = quantnota / 100;
    resto = quantnota % 100;
    nota50 = resto / 50;
    resto %= 50;
    nota20 = resto / 20;
    resto %= 20;
    nota10 = resto / 10;
    resto %= 10;
    nota5 = resto / 5;
    resto %= 5;
    nota2 = resto / 2;
    resto %= 2;
    nota1 = resto / 1;

    cout << quantnota << "\n";
    cout << nota100 << " nota(s) de R$ 100,00\n";
    cout << nota50 << " nota(s) de R$ 50,00\n";
    cout << nota20 << " nota(s) de R$ 20,00\n";
    cout << nota10 << " nota(s) de R$ 10,00\n";
    cout << nota5 << " nota(s) de R$ 5,00\n";
    cout << nota2 << " nota(s) de R$ 2,00\n";
    cout << nota1 << " nota(s) de R$ 1,00" << endl;

    system("pause");
    return 0;
}
