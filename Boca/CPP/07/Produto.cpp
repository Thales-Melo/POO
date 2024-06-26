#include "Produto.hpp"

using namespace std;

Produto::Produto(int codigoBarras, const string& nome, double preco) : codigoBarras(codigoBarras), nome(nome), preco(preco) {}


void Produto::print(ostream &out) const {
    out << nome << " (R$ " << preco << ")";
}

ostream& operator<< (ostream &out, const Produto &produto) {
    produto.print(out);
    return out;
}

bool operator==(const Produto& esq, const Produto& dir) {
    return esq.codigoBarras == dir.codigoBarras;
}

Produto::~Produto() {}
