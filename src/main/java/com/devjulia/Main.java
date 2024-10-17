package com.devjulia;

import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroAleatorio = new Random().nextInt(50) + 1;
        int tentativas = 5;

        System.out.println("Você terá" + tentativas + " tentativas para adivinhar o número certo");

        for (int i = 0; i < tentativas; i++) {
            System.out.println("Insira o numero de 1 a 50: ");
            int numero = scanner.nextInt();

            if (numero == numeroAleatorio) {
                System.out.println("Você acertou!! O número foi: " + numeroAleatorio);
                break;
            } else {
                System.out.println("Você errou!!");
                int tentativasRestantes = tentativas - (i + 1);

                System.out.println("Restam: " + tentativasRestantes + " canches.");


                if (numero > numeroAleatorio) {
                    System.out.println("O número é maior");
                } else {
                    System.out.println("O número é menor");
                }
                if (tentativasRestantes == 0) {
                    System.out.println("Você esgotou o número de tentativas. O número era: " + numeroAleatorio);
                }
            }
        }
        scanner.close();
    }
}
