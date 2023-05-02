
package Ex8;
import java.util.Scanner;
public class Metodo8 {
    Scanner sc = new Scanner(System.in);

    public static double percent;
    public static double precodeCusto;

    public double vender(){

        System.out.println("Informe o preço de custo:  ");
        precodeCusto = sc.nextDouble();

        System.out.println("Informe o percentual do acréscimo: ");
        percent = sc.nextDouble();

        percent = (percent/100) * precodeCusto;

        double valorVenda = percent + precodeCusto;

        System.out.println("Valor de venda do produto é " + valorVenda);

        return 0;
    }



}
