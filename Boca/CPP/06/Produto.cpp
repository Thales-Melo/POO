#include "Produto.hpp"

Produto::Produto(const string& nome, double preco) : nome(nome), preco(preco) {}


void Produto::print(ostream &out) const {
    out << nome << " (R$ " << preco << ")";
}

ostream& operator<< (ostream &out, const Produto &produto) {
    produto.print(out);
    return out;
}

Produto::~Produto() {}
