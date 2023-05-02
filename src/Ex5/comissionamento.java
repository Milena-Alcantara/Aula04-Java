package Ex5;
import java.util.Scanner;
public class comissionamento {


        Scanner sc = new Scanner(System.in);

        public static String nome;
        public static double salario;
        public static double vendas;


        public double registro() {

            System.out.println("Informe seu nome: ");
            nome = sc.next();

            System.out.println("Informe seu salário fixo: ");
            salario = sc.nextDouble();

            System.out.println("Quantos reais ao todo foram efetuados nas vendas desse mês? ");
            vendas = sc.nextInt();

            return 0;

        }

        public double comissaoCalc() {

            double salarioAtual;
            double comissao = vendas * ((double) 15 / 100);

            salarioAtual = comissao + salario;

            System.out.println(nome + "\n" + vendas + "\n" + salario + "\n " + salarioAtual);
            return 0;
        }


    }

