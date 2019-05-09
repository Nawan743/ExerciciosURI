#include <iostream>
#include <stdlib.h>

using namespace std;

int main(){

    int temposeg, h, m, s;
    int resto;

    cin >> temposeg;

    h = temposeg / 3600;
    resto = temposeg % 3600;
    m = resto / 60;
    s = temposeg % 60;

    cout << h << ":" << m << ":" << s << endl;

    system("pause");
    return 0;
}
