//4. Faça um programa que receba uma quantidade X de números e
//imprimir o menor número (suponha números diferentes) entre eles
//Obs: use vetores para a resolução do exercício
package Ex4;

import java.util.Scanner;
public class Vetor {

    public int vet[] = new int[3];
    Scanner sc = new Scanner(System.in);
    public int solicitaNum(){

        for (int i = 0; i < vet.length; i++) {

            System.out.println("Informe um número: ");
            vet[i] = sc.nextInt();

        }

        return 0;
    }

    public int verificaNum(){

        int menorValor = Integer.MAX_VALUE;

        for (int i = 0; i < vet.length; i++) {
            if (vet[i] < menorValor){
                menorValor = vet[i];
            }

        }
        System.out.println(menorValor);
        return 0;



    }
    }
