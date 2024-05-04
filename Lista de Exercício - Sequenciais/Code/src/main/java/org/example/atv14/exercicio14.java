package org.example.atv14;

/*Faça um algoritmo que leia um valor em binário até 6 dígitos e escreva o número
correspondente em decimal. Dica: Multiplique cada dígito binário pelo seu peso
(1,2,4,8...) e some os produtos.
*/

import java.util.Scanner;

public class exercicio14 {

    public static void main(String[] args) {

        String binario;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor binario: ");
        binario = sc.nextLine();

        int resultado = Integer.parseInt(binario, 2);
        System.out.println("O número binário " + binario + " em decimal é: " + resultado);
    }
}
