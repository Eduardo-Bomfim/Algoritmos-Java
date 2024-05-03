package org.example.atv3;

import java.util.Scanner;

/*
* Faça um algoritmo que leia 3 valores reais, notas de um aluno, e escreva sua média
aritmética. A média aritmética de um conjunto de valores é dada pela soma dos
valores dividido pela quantidade de valores considerados.
* */
public class exercicio3 {

    public static void main(String[] args) {

        float n1, n2, n3;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a nota 1: ");
        n1 = sc.nextFloat();
        System.out.println("Digite a nota 2: ");
        n2 = sc.nextFloat();
        System.out.println("Digite a nota 3: ");
        n3 = sc.nextFloat();

        float media = (n1 + n2 + n3) / 3;

        System.out.println("A média é " + media);

        sc.close();
    }
}
