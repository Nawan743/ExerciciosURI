#include <iostream>
#include <stdlib.h>
#include <iomanip>
#include <math.h>

using namespace std;

int main(){

    int idadedia, ano, mes, dia;
    int resto;

    cin >> idadedia;

    ano = idadedia / 365;
    resto = idadedia % 365;
    mes = resto / 30;
    dia = resto % 30;

    cout << ano << " ano(s)\n";
    cout << mes << " mes(es)\n";
    cout << dia << " dia(s)" << endl;

    system("pause");
    return 0;
}
