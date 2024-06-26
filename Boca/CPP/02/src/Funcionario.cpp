#include "Funcionario.hpp"

Funcionario::Funcionario(const string nome, double salario, const string dataAdmissao) {
    this->nome = nome;
    this->salario = salario;
    this->dataAdmissao = dataAdmissao;
}

void Funcionario::darAumento(double percentual) {
    this->salario += this->salario * percentual;
}

double Funcionario::getSalario() const {
    return this->salario;
}

string Funcionario::getNome() const {
    return this->nome;
}

Funcionario::~Funcionario() {
}