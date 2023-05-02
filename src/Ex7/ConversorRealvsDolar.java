package Ex7;
import java.util.Scanner;

public class ConversorRealvsDolar {
    Scanner sc = new Scanner(System.in);
    public double dolar;
    public double real;
    public double conversao;

    public double solicit(){

        System.out.println("Qual a cotação do dolar hoje? ");
        conversao = sc.nextDouble();

        return  0;
    }

    public double convert(){

        System.out.println("Informe quantos dolares você tem disponível: ");
        dolar = sc.nextDouble();

        real = dolar * conversao;

        System.out.println("Você tem R$" + real + " em real");

        return 0;
    }

}




