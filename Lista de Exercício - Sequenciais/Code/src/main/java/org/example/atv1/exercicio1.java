package org.example.atv1;
/*
* . Faça um algoritmo que leia um valor N, representando o lado de um quadrado, e
calcule e escreva a área do quadrado.
* */
import java.util.Scanner;

public class exercicio1 {

    public static void main(String[] args) {

        float n;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do lado do quadrado: ");
        n = sc.nextFloat();

        float area = n * n;
        System.out.println("A área é " + area);

        sc.close();
    }
}
