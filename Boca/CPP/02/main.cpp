#include <iostream>
#include "src/Departamento.hpp"
#include "src/Empresa.hpp"
#include "src/Funcionario.hpp"

int main () {

    string nomeEmpresa;
    string CNPJ;
    int numDeps;

    cin >> nomeEmpresa;
    cin >> CNPJ;
    cin >> numDeps;

    Empresa *empresa = new Empresa(nomeEmpresa, CNPJ, numDeps);

    for (int i=0; i<numDeps; i++) {
        string nomeDep;
        int numFuncs;

        cin >> nomeDep;
        cin >> numFuncs;

        Departamento *dep = new Departamento(nomeDep, numFuncs);

        for (int j=0; j<numFuncs; j++) {
            string nomeFunc;
            double salario;
            string dataAdmissao;

            cin >> nomeFunc;
            cin >> salario;
            cin >> dataAdmissao;

            Funcionario *func = new Funcionario(nomeFunc, salario, dataAdmissao);
            dep->adicionar(func);

        }

        empresa->adicionar(dep);
    }

    empresa->darAumento(0, 0.1);
    empresa->transferir(0, 0, 1);

    cout << *empresa;

    delete empresa;

    return 0;
}