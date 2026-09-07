import java.util.Scanner;

public class Exercicio14conversaodemoeda {

    static final double DOLAR = 5.40;

    public static void main(String[] args) {

        double dolar, reais, valor;

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o valor em reais:");
        valor = leia.nextDouble();

        dolar = valor / DOLAR;

        System.out.println("Valor em dolar: " + dolar);





    }
}
