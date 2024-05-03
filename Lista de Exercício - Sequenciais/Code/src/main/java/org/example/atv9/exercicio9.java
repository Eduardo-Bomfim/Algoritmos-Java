package org.example.atv9;

/*
*Faça um algoritmo que leia 3 valores v1, v2 e v3, e troque os valores entre si de modo
que ao final a variável v2 contenha o valor que foi lido para v1, a variável v3 contenha
o valor que foi lido para v2, e a variável v1 contenha o valor que foi lido para a variável
v3. Dica: Para trocar os valores de duas variáveis (digamos v1 e v2) entre si, salva-se o
valor de uma delas (p.ex., v1) em uma variável auxiliar qualquer (p.ex., aux) , copia-se
o valor da segunda (v2) para a variável que foi salva (v1), e copia-se o valor da variável
auxiliar (que contem o valor original da primeira), para a segunda variável.
*  */

import java.util.Scanner;

public class exercicio9 {

    public static void main(String[] args) {

        int v1, v2, v3, aux;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        v1 = sc.nextInt();
        System.out.println("Digite um valor: ");
        v2 = sc.nextInt();
        System.out.println("Digite um valor: ");
        v3 = sc.nextInt();

        aux = v1;
       v1 = v3;
       v3 = v2;
       v2 = aux;

        System.out.println("Os valores v1:" + v1
        + "\nOs valores v2:" + v2
        + "\nOs valores v3:" + v3);

        sc.close();
    }
}
