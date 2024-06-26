#include <iostream>
#include "Produto.hpp"
#include "CD.hpp"
#include "DVD.hpp"
#include "Livro.hpp"
#include "Tokenizer.hpp"
#include <vector>

using namespace std;

int main() {

    int N;
    cin >> N;
    cin.ignore(); // Isso aq ignora o \n que ficou no buffer

    vector<Produto*> produtos;

    for (int i = 0; i < N; i++) {
        Produto *p = nullptr;

        string line;
        getline(cin, line);

        Tokenizer tok(line, ',');

        string tipo = tok.next();
        string nome = tok.next();
        double preco = stod(tok.next());

        if (tipo == "C") {
            int numeroFaixas = stoi(tok.next());
            p = new CD(nome, preco, numeroFaixas);
        } else if (tipo == "D") {
            int duracao = stoi(tok.next());
            p = new DVD(nome, preco, duracao);
        } else if (tipo == "L") {
            string autor = tok.next();
            p = new Livro(nome, preco, autor);
        }

        produtos.push_back(p);
    }

    for (Produto *p : produtos) {
        cout << *p << endl;
        delete p;
    }


    return 0;
}
