package edu.santander.contaterminal;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Conta conta = new Conta();

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Seja bem vindo ao Banco BytCash, siga as instruçoes abaixo para acessar sua conta!");

        System.out.println("Digite o seu nome");
        conta.setNome(sc.next());

        System.out.println("Digite o numero da Conta!");
        conta.setNumeroConta(sc.nextInt());

        System.out.println("Digite o numero da Agencia!");
        conta.setAgencia(sc.next());

        System.out.println("Dejesa fazer um deposito?");
        System.out.println("1 - Sim");
        System.out.println("2 - Nao");

        switch (sc.nextInt()) {
            case 1:
                System.out.println("Digite o valor do deposito:");
                conta.setSaldo(sc.nextDouble());
                System.out.println("Deposito realizado, seu saldo atual é de: " + conta.getSaldo());
                System.out.println(conta);
                break;
            case 2:
                System.out.println(conta);
                break;
            default:
                break;
        }
        sc.close();
    }
}
