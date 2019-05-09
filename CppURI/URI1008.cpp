#include <iostream>
#include <iomanip>
#include <stdlib.h>

using namespace std;

int main(){

    int numfunc, numhoras;
    double salariohora, salario;

    cin >> numfunc;
    cin >> numhoras;
    cin >> salariohora;

    salario = numhoras * salariohora;

    cout << "NUMBER = " << numfunc << endl;
    cout << "SALARY = U$ " << fixed << setprecision(2) << salario << endl;

    system("pause");
    return 0;
}
