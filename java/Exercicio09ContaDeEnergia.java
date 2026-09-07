import java.util.Scanner;

public class Exercicio09ContaDeEnergia {

    public static void main(String[] args){

        double consumo,valor, conta;
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o consumo em kWh: ");
        consumo = leia.nextDouble();

        System.out.println("Digite o valor em kWh: ");
        valor = leia.nextDouble();

        conta = consumo * valor;

        if (conta >300){
            System.out.println("Consumo elevado");

        } else{
            System.out.println(" Consumo dentro do esperado");
        }
    }
}
