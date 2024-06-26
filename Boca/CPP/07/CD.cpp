#include "CD.hpp"

CD::CD(int codigoBarras, const string& nome, double preco, int numeroFaixas) : Produto(codigoBarras, nome, preco), numeroFaixas(numeroFaixas) {}

void CD::print(ostream &out) const {
    Produto::print(out);
    out << " - " << numeroFaixas << " faixas";
}

ostream& operator<< (ostream &out, CD &cd) {
    cd.print(out);
    return out;
}

CD::~CD() {}