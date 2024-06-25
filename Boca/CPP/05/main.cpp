#include <iostream>
#include "ContaCorrente.hpp"
#include "ContaCorrenteEspecial.hpp"
#include "NumberUtils.hpp"

using namespace std;

int main () {

    char tipoConta = ' ';

    cin >> tipoConta;

    ContaCorrente *conta;

    switch (tipoConta) {
        case 'C':
            conta = new ContaCorrente();
            break;
        case 'E':
            conta = new ContaCorrenteEspecial();
            break;
        default:
            return 1;
    }



    char op = ' ';
    do {
        cin >> op;
        if (op == '.') {
            break;
        }
        double value;
        cin >> value;

        switch (op) {
            case '+':
                conta->depositar(value);
                break;

            case '-':
                conta->sacar(value);
                break;

            default:
                break;
        }

        cout << "R$ " << formatDoubleCurrency(conta->getSaldo(), LOCALE_PT_BR) << endl;

    } while (op != '.');

    delete conta;

    return 0;
}