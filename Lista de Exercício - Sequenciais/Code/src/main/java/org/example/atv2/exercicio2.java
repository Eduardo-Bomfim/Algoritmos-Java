package org.example.atv2;
/*
* Faça um algoritmo que leia dois valores inteiros e escreva a sua soma*/

import java.util.Scanner;

public class exercicio2 {

    public static void main(String[] args) {

        int v1, v2;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        v1 = sc.nextInt();
        System.out.print("Digite um valor: ");
        v2 = sc.nextInt();

        int soma = v1 + v2;

        System.out.println("O resultado é " + soma);

        sc.close();
    }
}
