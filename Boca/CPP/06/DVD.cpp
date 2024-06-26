#include "DVD.hpp"

DVD::DVD(const string& nome, double preco, int duracao) : Produto(nome, preco), duracao(duracao) {}

void DVD::print(ostream &out) const {
    Produto::print(out);
    out << " - " << duracao << " minutos";
}

ostream& operator<< (ostream &out, DVD &dvd) {
    dvd.print(out);
    return out;
}

DVD::~DVD() {}