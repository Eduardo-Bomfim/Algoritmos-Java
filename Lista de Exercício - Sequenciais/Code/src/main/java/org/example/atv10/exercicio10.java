package org.example.atv10;

/*
* . Faça um algoritmo que leia 4 valores, Hi, Mi, Hf, Mf, representando respectivamente a
hora e minuto inicial e final de um evento, e calcule a duração do mesmo em horas e
minutos. Considere que o evento inicia e termina no mesmo dia. Dica: Para simplificar
o problema, converta cada par de valores em um único valor em minutos.*/

import java.util.Scanner;

public class exercicio10 {

    public static void main(String[] args) {

        int Hi, Mi, Hf, Mf;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a hora inicial: ");
        Hi = sc.nextInt();
        System.out.println("Digite o minuto inicial: ");
        Mi = sc.nextInt();
        System.out.println("Digite a hora final: ");
        Hf = sc.nextInt();
        System.out.println("Digite o minuto final: ");
        Mf = sc.nextInt();

        int minInicioTotal = Hi * 60 + Mi;
        int minFimTotal = Hf * 60 + Mf;

        int duracaoMinutos = minInicioTotal - minFimTotal;

        int horas = duracaoMinutos  / 60;
        int minutos = duracaoMinutos % 60;

        System.out.println(horas + ":" + minutos + ":00");
    }
}
