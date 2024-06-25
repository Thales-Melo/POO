#include "Esportista.hpp"
#include "StringUtils.hpp"

Esportista::Esportista(const string& nome, int idade, double altura, const string& time) : Pessoa(nome, idade, altura) {
    this->time = time;
}

bool Esportista::comparaPorTime(const Esportista* e1, const Esportista* e2) {
    return cpp_util::stringCompare(e1->time, e2->time);
}

ostream& operator<< (ostream& os, const Esportista& e) {
    os << e.getNome() << " (idade: " << e.getIdade() << "; altura: " << e.getAltura() << ") - " << e.time;

    return os;
}