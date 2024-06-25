#include "Departamento.hpp"
#include <iostream>

Departamento::Departamento(const string nome, const int numFuncs) {
    this->nome = nome;
    this->numFuncs = numFuncs;
    this->idxFuncs = 0;
    this->funcionarios = new Funcionario*[numFuncs];
}

string Departamento::getNome() const {
    return this->nome;
}

void Departamento::adicionar(Funcionario* funcionario) {
    if (this->idxFuncs >= this->numFuncs) {
        Funcionario** novoFuncionario = new Funcionario*[this->numFuncs * 2];

        for (int i=0; i<this->numFuncs; i++) {
            novoFuncionario[i] = this->funcionarios[i];
        }

        delete[] this->funcionarios;

        this->funcionarios = novoFuncionario;
        this->numFuncs *= 2;

    }
    this->funcionarios[this->idxFuncs] = funcionario;
    this->idxFuncs++;
}

void Departamento::darAumento(const double percentual) {
    for (int i=0; i<this->idxFuncs; i++) {
        this->funcionarios[i]->darAumento(percentual);
    }
}

void Departamento::remover(int idx) {
    for (int i=idx; i<this->idxFuncs-1; i++) {
        this->funcionarios[i] = this->funcionarios[i+1];
    }
    this->idxFuncs--;
}

void Departamento::transferir(const int idxFunc, Departamento* destino) {
    destino->adicionar(this->funcionarios[idxFunc]);
    this->remover(idxFunc);
}

double Departamento::calcularCusto() const {
    double custoTotal = 0;
    for (int i=0; i<idxFuncs; i++) {
        custoTotal += this->funcionarios[i]->getSalario();
    }
    return custoTotal;
}

Departamento::~Departamento() {
    for (int i=0; i<this->numFuncs; i++) {
        if (this->funcionarios[i] != nullptr) {
            delete this->funcionarios[i];
            this->funcionarios[i] = nullptr;
        }
    } 
    delete []this->funcionarios;
}