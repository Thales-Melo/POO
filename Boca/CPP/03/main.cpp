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
            for (const auto& pessoa : pessoas) {
                cout << pessoa << endl;
            }
        }
        else if (op == "ordenar") {
            char criterio;
            cin >> criterio;
            if (criterio == 'N') {
                sort(pessoas.begin(), pessoas.end(), [](const Pessoa& p1, const Pessoa& p2) {
                    return Pessoa::comparaPorNome(&p1, &p2);
                });
            }
            else if (criterio == 'I') {
                sort(pessoas.begin(), pessoas.end(), [](const Pessoa& p1, const Pessoa& p2) {
                    return Pessoa::comparaPorIdade(&p1, &p2);
                });
            }
            else if (criterio == 'A') {
                sort(pessoas.begin(), pessoas.end(), [](const Pessoa& p1, const Pessoa& p2) {
                    return Pessoa::comparaPorAltura(&p1, &p2);
                });
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
