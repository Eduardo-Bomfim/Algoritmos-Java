package org.example.atv5;

/*
* Faça um algoritmo que leia 3 valores a, b e c, coeficientes de uma equação de segundo
grau, e calcule e escreva as raizes da equação. Dica: As raízes de uma equação podem
ser calculadas pela fórmula de Baskhara.
* */

import java.util.Scanner;

public class exercicio5 {

    public static void main(String[] args) {

        double a, b, c, delta, raiz1, raiz2;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de a: ");
        a = sc.nextDouble();
        System.out.println("Digite o valor de b: ");
        b = sc.nextDouble();
        System.out.println("Digite o valor de c: ");
        c = sc.nextDouble();

        delta = b * b - 4 * a * c;

        raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
        raiz2 = (-b - Math.sqrt(delta)) / (2 * a);

        System.out.println("Raiz 1: " + raiz1);
        System.out.println("Raiz 2: " + raiz2);

        sc.close();
    }
}
