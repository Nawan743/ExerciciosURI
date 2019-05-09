#include <iostream>
#include <stdlib.h>

using namespace std;

int main(){

    int A, B, C, maiorAB, maiorAC;

    cin >> A;
    cin >> B;
    cin >> C;

    maiorAB =(A+B+abs(A-B)) / 2;
    maiorAC = (maiorAB+C+abs(maiorAB-C)) / 2;

    cout << maiorAC << " eh o maior" << endl;

    system("pause");
    return 0;
}
