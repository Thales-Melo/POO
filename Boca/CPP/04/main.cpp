#include <iostream>
#include <vector>
#include <algorithm>
#include "Esportista.hpp"

using namespace std;

bool comparaPorNome(const Esportista& p1, const Esportista& p2) {
    return Esportista::comparaPorNome(&p1, &p2);
}

bool comparaPorIdade(const Esportista& p1, const Esportista& p2) {
    return Esportista::comparaPorIdade(&p1, &p2);
}

bool comparaPorAltura(const Esportista& p1, const Esportista& p2) {
    return Esportista::comparaPorAltura(&p1, &p2);
}

bool comparaPorTime(const Esportista& e1, const Esportista& e2) {
    return Esportista::comparaPorTime(&e1, &e2);
}

int main () {

    vector<Esportista> atletas;

    string op;
    cin >> op;

    while (op != "sair") {
        if (op == "cadastrar") {
            string nome;
            int idade;
            double altura;
            string time;
            cin >> nome >> idade >> altura >> time;
            Esportista e(nome, idade, altura, time);
            atletas.push_back(e);
        }
        else if (op == "listar") {
            int i=0;
            for (const auto& atleta : atletas) {
                cout << i << ": " << atleta << endl;
                i++;
            }
        }
        else if (op == "ordenar") {
            char criterio;
            cin >> criterio;
            if (criterio == 'N') {
                sort(atletas.begin(), atletas.end(), comparaPorNome);
            }
            else if (criterio == 'I') {
                sort(atletas.begin(), atletas.end(), comparaPorIdade);
            }
            else if (criterio == 'A') {
                sort(atletas.begin(), atletas.end(), comparaPorAltura);
            }
            else if (criterio == 'T') {
                sort(atletas.begin(), atletas.end(), comparaPorTime);
            }
        }
        else if (op == "excluir") {
            int idx;
            cin >> idx;
            atletas.erase(atletas.begin() + idx);
        }
        cin >> op;
    }

    return 0;
}
