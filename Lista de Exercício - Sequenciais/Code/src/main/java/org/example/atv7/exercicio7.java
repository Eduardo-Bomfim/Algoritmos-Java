package org.example.atv7;

import java.util.Scanner;

/*
* Faça um algoritmo que lê uma quantia inteira em segundos e escreva o número de
horas, minutos e segundos correspondente
* */
public class exercicio7 {

    public static void main(String[] args) {

        int horas, minutos, segundos, segundosTotal, segundoRestante;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade em segundos: ");
        segundosTotal = sc.nextInt();

        horas = segundosTotal/3600;
        segundoRestante = segundosTotal % 3600;

        minutos = segundoRestante/60;

        segundos = segundoRestante % 60;

        System.out.println(horas + ":" + minutos + ":" + segundos);

        sc.close();
    }
}
