package org.example.atv12;

/*Faça um algoritmo que a partir de um horário (hora, minuto, segundo) e uma
quantidade de segundos transcorridos, calcule o segundo horário.*/

import java.util.Scanner;

public class exercicio12 {

    public static void main(String[] args) {

        int hora, minuto, segundo, segundosTranscorridos;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o hora: ");
        hora = sc.nextInt();
        System.out.print("Digite o minuto: ");
        minuto = sc.nextInt();
        System.out.print("Digite o segundo: ");
        segundo = sc.nextInt();

        System.out.println("Digite os segundos transcorridos: ");
        segundosTranscorridos = sc.nextInt();

        int tempoInicialConvertido = hora * 3600 + minuto * 60 + segundo;

        int tempoTranscorrido = tempoInicialConvertido + segundosTranscorridos;

        int horaTranscorrida = tempoTranscorrido / 3600;
        int minutoTranscorrido = tempoTranscorrido % 60;
        int segundoTranscorrido = tempoTranscorrido % 3600;

        System.out.println(horaTranscorrida + ":" + minutoTranscorrido + ":" + segundoTranscorrido);

        sc.close();
    }
}
