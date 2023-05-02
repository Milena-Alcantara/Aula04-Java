package Ex1;

public class Operacao {

    int result;

    public int soma(int numeroUser){

        for (int i = 0; i <=numeroUser ; i++) {
            result += i;
        }
        return result;
    }
}
