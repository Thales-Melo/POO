#include "Triangulo.hpp"
#include <iostream>

Triangulo::Triangulo(double xa, double ya, double xb, double yb, double xc, double yc) {
    a = Ponto(xa, ya);
    b = Ponto(xb, yb);
    c = Ponto(xc, yc);
}

double Triangulo::perimetro() const {
    return a.distancia(b) + b.distancia(c) + c.distancia(a);
}