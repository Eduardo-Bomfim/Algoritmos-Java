package org.example;

/*
* Faça um programa em JAVA que leia todas as notas dos alunos de uma turma de Programação de Soluções Computacionais que possui N alunos
* (a ser informado pelo usuário). Sabe-se que os alunos efetuam M provas (a ser informado pelo usuário) no semestre. O programa deve ler
* as notas de cada aluno e imprimir (Autor - Eduardo de Andrade do Bomfim Júnior) sua nota final e se o mesmo foi aprovado (nota >= 70)
* no semestre. O programa também deve imprimir o número total de alunos aprovados e reprovados).
* */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 'nota' = referente as notas dos alunos, 'qtdAlunos' = referente a quantidade de alunos da turma de
        // Soluções Computacionais, 'qtdProvas' = referente a quantidade de provas realizadas na turma,
        // (Autor - Eduardo de Andrade do Bomfim Júnior) 'alunoAprovado' = referente ao número total de alunos
        // aprovados na turma e 'alunoReprovado' = referente a
        // quantidade de alunos reprovados na turma

        int nota, qtdAlunos, qtdProvas, alunoAprovado = 0, alunoReprovado = 0, mediaNotas;



        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de alunos: ");
        qtdAlunos = sc.nextInt();
        System.out.println("Digite a quantidade de provas: ");
        qtdProvas = sc.nextInt();

        for (int i = 0; i < qtdAlunos; i++) {

            int somaNotas = 0;

            for (int j = 0; j < qtdProvas; j++) {
                System.out.println("Digite a nota do aluno: ");
                nota = sc.nextInt();
                somaNotas += nota;
            }
            mediaNotas = somaNotas / qtdProvas;
            System.out.println("Sua nota final: " + mediaNotas);

            if (mediaNotas >= 70) {
                System.out.println("Aluno aprovado!");
                alunoAprovado++;
            }else {
                System.out.println("Aluno reprovado!");
                alunoReprovado++;
            }
        }

        System.out.println("Alunos aprovados: " + alunoAprovado);
        System.out.println("Alunos reprovados: " + alunoReprovado);

        sc.close();
    }
}