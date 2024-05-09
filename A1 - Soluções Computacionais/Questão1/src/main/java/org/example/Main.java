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

        //Instanciei o Scanner
        Scanner sc = new Scanner(System.in);

        //Solicitei para o usuário digitar a quantidade alunos na turma
        System.out.println("Digite a quantidade de alunos: ");
        qtdAlunos = sc.nextInt();

        //Solicitei para o usuario digitar a quantidade provas que os alunos irão fazer
        System.out.println("Digite a quantidade de provas: ");
        qtdProvas = sc.nextInt();

        //Iniciei o laço de repetição para calcular a média de cada aluno
        for (int i = 0; i < qtdAlunos; i++) {

            //Criei essa variável aqui, porque toda vez que o programa terminar de calcular a média e se o aluno foi
            // aprovado ou não, a variável ser sempre 0 para não fazer o cálculo das notas dos alunos anteriores.

            int somaNotas = 0;

            //Iniciei o laço de repetição para capturar as notas do aluno em cada prova
            for (int j = 0; j < qtdProvas; j++) {

                //Solicitei para digitar a nota do aluno
                System.out.println("Digite a nota do aluno: ");
                nota = sc.nextInt();

                //Essa variável está somando as notas do aluno
                somaNotas += nota;
            }

            //Essa variável está calculando a média do aluno
            mediaNotas = somaNotas / qtdProvas;

            //Estou exibindo a nota final do aluno
            System.out.println("Sua nota final: " + mediaNotas);

            //Essas condicionais estão averiguando se o aluno foi aprovado ou reprovado
            if (mediaNotas >= 70) {
                System.out.println("Aluno aprovado!");

                //Caso o aluno seja aprovado essa variável vai incrementar +1 em seu valor
                alunoAprovado++;
            }else {
                System.out.println("Aluno reprovado!");

                //Caso o aluno seja reprovado essa variável vai incrementar +1 em seu valor
                alunoReprovado++;
            }
        }

        //Esses comandos estão exibindo a quantidade de alunos aprovados e reprovados
        System.out.println("Alunos aprovados: " + alunoAprovado);
        System.out.println("Alunos reprovados: " + alunoReprovado);

        //Fechando o Scanner
        sc.close();
    }
}