package org.example.atv11;

/*
* Faça um algoritmo que leia dois horários (hora, minuto e segundo) e escreva quantos
segundos transcorreram entre esses dois horários.
* */

import java.util.Scanner;

public class exercicio11 {

    public static void main(String[] args) {

        int horaInicial, minutoInicial, segundoInicial, horaFinal, minutoFinal, segundoFinal;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o hora inicial: ");
        horaInicial = sc.nextInt();
        System.out.println("Digite o minuto inicial: ");
        minutoInicial = sc.nextInt();
        System.out.println("Digite o segundo inicial: ");
        segundoInicial = sc.nextInt();

        System.out.println("Digite o hora final: ");
        horaFinal = sc.nextInt();
        System.out.println("Digite o minuto final: ");
        minutoFinal = sc.nextInt();
        System.out.println("Digite o segundo final: ");
        segundoFinal = sc.nextInt();

        int horaCalc = horaInicial - horaFinal;
        int minCalc = minutoInicial - minutoFinal;
        int segCalc = segundoInicial - segundoFinal;

        int horaConv = (horaCalc * 60) * 60;
        int minConv = minCalc * 60;

        int segTotal = horaConv + minConv + segCalc;

        System.out.println(segTotal);

        sc.close();
    }
}
