#include <iostream>
#include "src/Triangulo.hpp"
using namespace std;

int main() {

    double xa, ya, xb, yb, xc, yc;

    cin >> xa;
    cin >> ya;
    cin >> xb;
    cin >> yb;
    cin >> xc;
    cin >> yc;

    // Criar novo triangulo
    Triangulo triangulo(xa, ya, xb, yb, xc, yc);

    // Calcular perimetro com cinco casas decimais
    cout.precision(5);
    cout << fixed << triangulo.perimetro() << endl;


    return 0;
}