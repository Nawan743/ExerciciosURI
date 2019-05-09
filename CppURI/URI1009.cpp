#include <iostream>
#include <stdlib.h>
#include <string>
#include <iomanip>

using namespace std;

int main(){

    string nome;
    double salariofixo, totalvendas, total;

    cin >> nome;
    cin >> salariofixo;
    cin >> totalvendas;

    total = salariofixo + (totalvendas*15/100);

    cout << "TOTAL = R$ " << fixed << setprecision(2) << total << endl;

    system("pause");
    return 0;
}
