package Ex2;
import java.util.Scanner;
//Faça um algoritmo que contenha uma função que receba o nome de um
//        usuário e retorne a mensagem Meu nome é <NomeDigitado>.

public class Principal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Nome pessoa = new Nome();

        System.out.println("informe o seu nome ");

        pessoa.coletar(sc.next());
    }



}
