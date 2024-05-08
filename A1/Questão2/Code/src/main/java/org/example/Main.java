package org.example;
/*
* Você está desenvolvendo um programa em Java para classificar números inteiros positivos em três categorias diferentes:
*  pares, ímpares e múltiplos de 5. Seu objetivo é contar quantos números caem em cada categoria.

Escreva um programa Java que peça ao usuário para inserir uma lista de números inteiros positivos
* (use um valor negativo como sinal de parada) e, em seguida, exiba o número total de números pares,
* o número total de números ímpares e o número total de números múltiplos de 5 na lista inserida.

Você deve usar um loop while para ler os números até que o usuário insira um valor negativo para
* sinalizar o término da entrada. Dentro do loop,(Autor - Eduardo de Andrade do Bomfim Júnior) use instruções if para
* classificar cada número
* na categoria apropriada. Lembre-se de manter um contador para cada categoria.

Ao final, exiba os resultados.

Exemplo de Execução:

Insira um número inteiro positivo (ou um número negativo para sair): 3

Insira um número inteiro positivo (ou um número negativo para sair): 6

Insira um número inteiro positivo (ou um número negativo para sair): 9

Insira um número inteiro positivo (ou um número negativo para sair): 10

Insira um número inteiro positivo (ou um número negativo para sair): -1

Resultados:

Números pares: 2

Números ímpares: 2

Múltiplos de 5: 1

Neste problema, você usará a estrutura de controle if para verificar se cada
* número pertence a uma das três categorias e, em seguida, atualizar os contadores apropriados.
* O loop while permite que você leia números até que o usuário escolha parar.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 'contadorPar' = serve para ver quantos números pares tem na lista, 'contadorImpar' = serve para ver
        // quantos números ímpares tem na lista, 'contadorMultiplo' = serve para ver quantos multiplos de 5 tem na
        // lista, 'tamanho' = serve para ver o tamanho da lista, 'inteiroPositivo' = criei como vetor para armazenar
        // uma lista de números inteiros positivos

        int contadorPar = 0, contadorImpar = 0, contadorMultiplo = 0, tamanho = 0;

        int[] inteiroPositivo = new int[100];

        //Instanciei o Scanner
        Scanner sc = new Scanner(System.in);

        //Solicitando para o usuário digitar números inteiros positivos para classifica-los ou um número negativo
        // para fechar o programa
        System.out.println("Insira uma lista de número inteiros positivos (Insira um número negativo para parar o " +
                "programa)");

        //Iniciando o laço de repetição
        while (true) {
            //Capturando o valor inserido pela usuário e armazenando na variável
            inteiroPositivo[tamanho] = sc.nextInt();

            //Essa condicional averigua se número digitado é negativo, se for o loop é quebrado
            if (inteiroPositivo[tamanho] < 0){
                break;
            }

            //Essas condicionais estão averiguando se o número armazenado é par ou ímpar
            if (inteiroPositivo[tamanho] % 2 == 0) {
                contadorPar++;
            }else{
                contadorImpar++;
            }

            //Essa condicional está averiguando se o número armazenado é múltiplo de 5
            if (inteiroPositivo[tamanho] % 5 == 0) {
                contadorMultiplo++;
            }

            //Incrementando +1 para aumentar o tamanho do vetor
            tamanho++;
        }

        //Exibindo o resultado da lista de números
        System.out.println("Total de números pares: " + contadorPar);
        System.out.println("Total de números impares: " + contadorImpar);
        System.out.println("Total de números multiplos de 5: " + contadorMultiplo);

        //Fechando o Scanner
        sc.close();
    }
}