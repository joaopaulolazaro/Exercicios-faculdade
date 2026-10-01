import java.util.Scanner;

public class DevStoreAtividade {

    static void exibirCabecalho() {
        System.out.println("DevStore - Sistema de Gestao de Caixa e Vendas");
    }

    static double calcularSubtotal(double preco, int quantidade) {
        return preco * quantidade;
    }

    static double calcularDesconto(double subtotal, int tipoCliente) {
        double taxa = 0;
        if (tipoCliente == 2) {
            taxa = 0.10;
        } else if (tipoCliente == 3) {
            taxa = 0.15;
        }
        return subtotal * taxa;
    }

    static double calcularImposto(double valorComDesconto) {
        return valorComDesconto * 0.05;
    }

    static void exibirComprovante(double totalBruto, double totalDesconto,
                                  double totalImposto, double valorFinal) {
        System.out.println("Sua compra foi de R$ " + totalBruto + ".");
        System.out.println("Voce recebeu R$ " + totalDesconto + " de desconto.");
        System.out.println("O imposto foi de R$ " + totalImposto + ".");
        System.out.println("O valor final a pagar e R$ " + valorFinal + ".");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        exibirCabecalho();

        double totalBruto = 0;
        for (int i = 1; i <= 3; i++) {
            System.out.print("Preco do produto " + i + ": ");
            double preco = sc.nextDouble();
            System.out.print("Quantidade do produto " + i + ": ");
            int quantidade = sc.nextInt();
            totalBruto += calcularSubtotal(preco, quantidade);
        }

        System.out.print("Tipo de cliente (1-Comum, 2-VIP, 3-Funcionario): ");
        int tipoCliente = sc.nextInt();

        double totalDesconto = calcularDesconto(totalBruto, tipoCliente);
        double totalImposto = calcularImposto(totalBruto - totalDesconto);
        double valorFinal = totalBruto - totalDesconto + totalImposto;

        exibirComprovante(totalBruto, totalDesconto, totalImposto, valorFinal);
    }
}