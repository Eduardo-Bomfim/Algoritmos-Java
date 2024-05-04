package org.example.atv13;

/*Faça um algoritmo que leia a quantidade de alunos em uma sala de aula e a
quantidade de alunos por grupo, e calcule e escreva quantos grupos serão formados e
o resto de alunos que não foram suficientes para formar mais um grupo.
*/

import java.util.Scanner;

public class exercicio13 {

    public static void main(String[] args) {

        int quantAlunosSala, quantAlunosGrupo, restoGrupo, divisaoGrupo;

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantidade de alunos sala: ");
        quantAlunosSala = sc.nextInt();
        System.out.print("Quantidade de alunos grupo: ");
        quantAlunosGrupo = sc.nextInt();

        divisaoGrupo = quantAlunosSala / quantAlunosGrupo;
        restoGrupo = quantAlunosSala % quantAlunosGrupo;

        System.out.println("Quantidade de grupo: " + divisaoGrupo);
        System.out.println("Quantidade de alunos restantes: " + restoGrupo);

        sc.close();
    }
}
