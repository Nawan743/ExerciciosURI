#include <iostream>
#include <stdlib.h>

using namespace std;

int main(){

    int notasint, notas100, notas50, notas20, notas10, notas5, notas2;
    int moedas, moedas100, moedas50, moedas25, moedas10, moedas5, moedas1;
    float notas;

    cin >> notas;
    notasint = notas * 100;

    notas100 =  notasint / 10000;
    notas50 =  (notasint % 10000) / 5000;
    notas20 = ((notasint % 10000) % 5000) / 2000;
    notas10 = (((notasint % 10000) % 5000) % 2000) / 1000;
    notas5 = ((((notasint % 10000) % 5000) % 2000) % 1000) / 500;
    notas2 = (((((notasint % 10000) % 5000) % 2000) % 1000) % 500) / 200;

    moedas = ((((((notasint % 10000) % 5000) % 2000) % 1000) % 500) % 200);

    moedas100 = moedas / 100;
    moedas50 = (moedas % 100) / 50;
    moedas25 = ((moedas % 100) % 50) / 25;
    moedas10 = (((moedas % 100) % 50) % 25) / 10;
    moedas5 = ((((moedas % 100) % 50) % 25) % 10) / 5;
    moedas1 = (((((moedas % 100) % 50) % 25) % 10) % 5) / 1;

    cout << "NOTAS:\n";
    cout << notas100 << " nota(s) de R$ 100.00\n";
    cout << notas50 << " nota(s) de R$ 50.00\n";
    cout << notas20 << " nota(s) de R$ 20.00\n";
    cout << notas10 << " nota(s) de R$ 10.00\n";
    cout << notas5 << " nota(s) de R$ 5.00\n";
    cout << notas2 << " nota(s) de R$ 2.00\n";

    cout << "MOEDAS:\n";
    cout << moedas100 << " moeda(s) de R$ 1.00\n";
    cout << moedas50 << " moeda(s) de R$ 0.50\n";
    cout << moedas25 << " moeda(s) de R$ 0.25\n";
    cout << moedas10 << " moeda(s) de R$ 0.10\n";
    cout << moedas5 << " moeda(s) de R$ 0.05\n";
    cout << moedas1 << " moeda(s) de R$ 0.01" << endl;

    system("pause");
    return 0;
}
