package Ex1;

import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) {
//Faça um algoritmo que contenha um método que receba um número do
//usuário e realize a somatório de todos os números no intervalo de 1 até o
//número digitado pelo usuário. Exiba o resultado final da somatória.

        Scanner sc = new Scanner(System.in);
        Operacao conta = new Operacao();

        System.out.println("Informe um número: ");
        int numero = sc.nextInt();

        conta.soma(numero);
        System.out.println(conta.result);
    }
}