#include "ContaCorrente.hpp"

void ContaCorrente::depositar(double quantia) {
    saldo += quantia;
}

void ContaCorrente::sacar(double quantia) {
    saldo -= quantia + (quantia * getTaxaOperacao());
}

double ContaCorrente::getSaldo() {
    return saldo;
}

double ContaCorrente::getTaxaOperacao() {
    return 0.005;
}

