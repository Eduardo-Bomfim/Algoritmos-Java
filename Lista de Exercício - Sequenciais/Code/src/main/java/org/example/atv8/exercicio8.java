package org.example.atv8;

import java.util.Scanner;

/*
* Faça um algoritmo que le um valor entre 0 e 9999 e calcula a soma dos seus dígitos.
Dica: O dígito menos significativo de um número inteiro pode ser obtido pelo resto da
divisão do número por 10. Os dígitos restantes podem ser obtidos pela divisão inteira
por 10.
* */
public class exercicio8 {

    public static void main(String[] args) {

        int valor, soma;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor entre 0 e 9999: ");
        valor = sc.nextInt();

        int digito1 = valor % 10;

        valor /= 10;

        int digito2 = valor % 10;

        valor /= 10;

        int digito3 = valor % 10;

        int digito4 = valor / 10;

        soma = digito1 + digito2 + digito3 + digito4;

        System.out.println("A soma dos dígitos de " + valor + " é: " + soma);

        sc.close();
    }
}
