import java.util.Scanner;

public class Exercicio04CalculadoraDeConsumoDeCombustivel {

    static void main() {
        double distancia, consumo, preco, litros_gastos, custo_total;

        Scanner leia = new Scanner(System.in);

        System.out.println(" Digite a distancia percorrida (em km) ");
        distancia = leia.nextDouble();

        System.out.println(" Digite o consumo do carro (em km/l) ");
        consumo = leia.nextDouble();

        System.out.println(" Digite o preco do combustivel (por litro) ");
        preco = leia.nextDouble();

        litros_gastos = distancia / consumo;
        custo_total = litros_gastos * preco;

        System.out.println(" litros gastos: " + litros_gastos );
        System.out.println(" Custo total: " + custo_total );

    }
}
