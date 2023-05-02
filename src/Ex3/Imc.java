package Ex3;

public class Imc {

    public static double altura;
    public static double peso;
    public double calImc() {
       double imc = peso / (altura * altura);

        if (imc < 18.5) {
            System.out.println("Magreza 0");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Normal 0");

        } else if (imc >= 25.0 && imc <= 29.9) {
            System.out.println("Sobrepeso I");

        } else if (imc >= 30.0 && imc <= 39.9) {
            System.out.println("Obesidade II");

        } else if (imc >= 40.0) {
            System.out.println("Obesidade III");
        }
        return imc;
    }
}