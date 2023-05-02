package Ex6;

import java.util.Scanner;
//Ler uma temperatura em graus Celsius e apresentá-la convertida em
//graus Fahrenheit. A fórmula de conversão é: F=(9*C+160) / 5, sendo F
//a temperatura em Fahrenheit e C a temperatura em Celsius.
public class Metodo {

    Scanner sc = new Scanner(System.in);

    public double tempcelsius;
    public double fahrenheit;

    public double conversao(){

        System.out.println("Informe a temperatura");

        tempcelsius = sc.nextDouble();

        fahrenheit = ((9*tempcelsius)+160)/5;

        System.out.println(fahrenheit);

        return fahrenheit;
    }

}

