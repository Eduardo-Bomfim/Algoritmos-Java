package org.example.atv4;

import java.util.Scanner;

/*
* Faça um algoritmo que leia 3 valores reais v1 e v2 e calcule e escreva a área do
triângulo que tem base igual a v1 e altura igual a v2. Dica: A área de um triângulo é
dada pela expressão:
(base x altura)/2
*/
public class exercicio4 {

    public static void main(String []args){

        float v1, v2, area;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor da base: ");
        v1 = sc.nextFloat();
        System.out.println("Digite o valor da altura: ");
        v2 = sc.nextFloat();

        area = (v1 * v2)/2;

        System.out.println("O valor da área é " + area);

        sc.close();
    }
}
