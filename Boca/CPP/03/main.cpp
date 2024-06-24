#include <iostream>
#include <vector>
#include "src/Pessoa.hpp"
#include <algorithm>
using namespace std;

int main () {

    vector<Pessoa> pessoas;

    string op;
    cin >> op;

    while (op != "sair") {
        if (op == "cadastrar") {
            string nome;
            int idade;
            double altura;
            cin >> nome >> idade >> altura;
            Pessoa p(nome, idade, altura);
            pessoas.push_back(p);
        }
        else if (op == "listar") {
            for (int i = 0; i < pessoas.size(); i++) {
                cout << pessoas[i] << endl;
            }
        }
        else if (op == "ordenar") {
            char criterio;
            cin >> criterio;
            if (criterio == 'N') {
                sort(pessoas.begin(), pessoas.end(), Pessoa::comparaPorNome);
            }
            else if (criterio == 'I') {
                sort(pessoas.begin(), pessoas.end(), Pessoa::comparaPorIdade);
            }
            else if (criterio == 'A') {
                sort(pessoas.begin(), pessoas.end(), Pessoa::comparaPorAltura);
            }
        }
        else if (op == "excluir") {
            int idx;
            cin >> idx;
            pessoas.erase(pessoas.begin() + idx);
        }
        cin >> op;
    }

    return 0;
}