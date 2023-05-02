package Ex3;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Imc user = new Imc();

        System.out.println("Informe seu altura:  ");
        Imc.altura = (sc.nextDouble());

        System.out.println("Informe seu peso:  ");
        Imc.peso = (sc.nextDouble());

       user.calImc();

    }

}
