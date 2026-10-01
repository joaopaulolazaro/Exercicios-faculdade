import java.util.Scanner;

public class TrabalhoDevStore {

    static void exibirCabecalho() {
        System.out.println("+===+===+===+===+===+===+===+===+===+");
        System.out.println("|   DEVSTORE - CAIXA E VENDAS       |");
        System.out.println("+===+===+===+===+===+===+===+===+===+");
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
        System.out.println();
        System.out.println("========== COMPROVANTE ==========");
        System.out.printf("Total bruto:    R$ %.2f%n", totalBruto);
        System.out.printf("Desconto:     - R$ %.2f%n", totalDesconto);
        System.out.printf("Imposto (5%%):  + R$ %.2f%n", totalImposto);
        System.out.println("---------------------------------");
        System.out.printf("VALOR FINAL:    R$ %.2f%n", valorFinal);
        System.out.println("=================================");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        exibirCabecalho();

        System.out.print("Preco do produto 1: ");
        double preco1 = sc.nextDouble();
        System.out.print("Quantidade do produto 1: ");
        int qtd1 = sc.nextInt();

        System.out.print("Preco do produto 2: ");
        double preco2 = sc.nextDouble();
        System.out.print("Quantidade do produto 2: ");
        int qtd2 = sc.nextInt();

        System.out.print("Preco do produto 3: ");
        double preco3 = sc.nextDouble();
        System.out.print("Quantidade do produto 3: ");
        int qtd3 = sc.nextInt();

        System.out.print("Tipo de cliente (1-Comum, 2-VIP, 3-Funcionario): ");
        int tipoCliente = sc.nextInt();

        double subtotal1 = calcularSubtotal(preco1, qtd1);
        double subtotal2 = calcularSubtotal(preco2, qtd2);
        double subtotal3 = calcularSubtotal(preco3, qtd3);

        double totalBruto = subtotal1 + subtotal2 + subtotal3;
        double totalDesconto = calcularDesconto(totalBruto, tipoCliente);
        double valorComDesconto = totalBruto - totalDesconto;
        double totalImposto = calcularImposto(valorComDesconto);
        double valorFinal = valorComDesconto + totalImposto;

        exibirComprovante(totalBruto, totalDesconto, totalImposto, valorFinal);
    }
}