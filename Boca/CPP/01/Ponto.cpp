#include "Ponto.hpp"
#include <cmath>

Ponto::Ponto(double _x, double _y) {
    x = _x;
    y = _y;
}

double Ponto::distancia(const Ponto& ponto) const {
    double dx = x - ponto.x;
    double dy = y - ponto.y;
    return std::sqrt(dx * dx + dy * dy);
}
