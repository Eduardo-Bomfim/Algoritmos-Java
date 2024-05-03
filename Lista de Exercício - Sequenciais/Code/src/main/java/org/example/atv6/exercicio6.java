package org.example.atv6;

import java.util.Scanner;

/*
* Faça um algoritmo que lê um valor inteiro em Reais e calcula e escreve qual o menor
número possível de notas de 100,50,20,10,5,2 e 1 real em que o valor pode ser
decomposto. Dica: Isso pode ser calculado a partir de operações de divisão inteira.
* */
public class exercicio6 {

    public static void main(String[] args) {

        int v1;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        v1 = sc.nextInt();

        int nota100 = v1 / 100;
        int resto = v1 % 100;

        int nota50 = v1 / 50;
        resto = v1 % 50;

        int nota20 = v1 / 20;
        resto = v1 % 20;

        int nota10 = v1 / 10;
        resto = v1 % 10;

        int nota5 = v1 / 5;
        resto = v1 % 5;

        int nota2 = v1 / 2;
        resto = v1 % 2;

        int nota1 = resto;

        System.out.println("Notas de 100 Reais: " + nota100);
        System.out.println("Notas de 50 Reais: " + nota50);
        System.out.println("Notas de 20 Reais: " + nota20);
        System.out.println("Notas de 10 Reais: " + nota10);
        System.out.println("Notas de 5 Reais: " + nota5);
        System.out.println("Notas de 2 Reais: " + nota2);
        System.out.println("Notas de 1 Real: " + nota1);

        sc.close();

    }
}
