#include "Livro.hpp" 

Livro::Livro(const string& nome, double preco, const string& autor) : Produto(nome, preco) {
    this->autor = autor;
}

void Livro::print(ostream &out) const {
    Produto::print(out);
    out << " - " << autor;
}

ostream& operator<< (ostream &out, Livro &livro) {
    livro.print(out);
    return out;
}

Livro::~Livro() {}