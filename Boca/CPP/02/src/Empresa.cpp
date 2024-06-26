#include "Empresa.hpp"
#include "NumberUtils.hpp"
#include <iostream>

Empresa::Empresa(const string nome, const string cnpj, const int numDeps) {
    this->nome = nome;
    this->cnpj = cnpj;
    this->numDeps = numDeps;
    this->departamentos = new Departamento*[numDeps];
    this->idxDeps = 0;
}


void Empresa::adicionar(Departamento* departamento) {
    this->departamentos[idxDeps] = departamento;
    this->idxDeps++;
}


void Empresa::darAumento(const int idx, const double percentual) {
    this->departamentos[idx]->darAumento(percentual);
}

void Empresa::transferir(const int idxDeptoOrigem, const int idxFunc, const int idxDeptoDestino) {
    this->departamentos[idxDeptoOrigem]->transferir(idxFunc, this->departamentos[idxDeptoDestino]);
}


ostream& operator<< (ostream &out, const Empresa &empresa) {   
    for (int i = 0; i < empresa.numDeps; i++) {
        Departamento *dep = empresa.departamentos[i];
        out << dep->getNome() << " R$ " << formatDoubleCurrency(dep->calcularCusto(), LOCALE_PT_BR) << std::endl;
    }
    return out;
}

Empresa::~Empresa() {
    for (int i=0; i<this->idxDeps; i++) {
        delete this->departamentos[i];
    }
    delete []this->departamentos;
}

