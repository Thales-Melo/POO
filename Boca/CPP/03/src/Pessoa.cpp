#include "Pessoa.hpp"
#include "StringUtils.hpp"

Pessoa::Pessoa(const string& nome, int idade, double altura) {
    this->nome = nome;
    this->idade = idade;
    this->altura = altura;
}

bool Pessoa::comparaPorNome(const Pessoa* p1, const Pessoa* p2) {
    return cpp_util::stringCompare(p1->nome, p2->nome);
}

bool Pessoa::comparaPorIdade(const Pessoa* p1, const Pessoa* p2) {
    return p1->idade < p2->idade;
}

bool Pessoa::comparaPorAltura(const Pessoa* p1, const Pessoa* p2) {
    return p1->altura < p2->altura;
}

ostream& operator<< (ostream& os, const Pessoa& p) {
    os << p.nome << " " << p.idade << " " << p.altura;
    return os;
}