#include <iostream>
#include <stdlib.h>

using namespace std;

int main(){

    int A, B, C, D, diferenca;

    cin >> A;
    cin >> B;
    cin >> C;
    cin >> D;

    diferenca = A*B - C*D;

    cout << "DIFERENCA = " << diferenca;

    system("pause");
    return 0;
}
