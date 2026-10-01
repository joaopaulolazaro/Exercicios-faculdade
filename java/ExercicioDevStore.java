import java.util.Scanner;

public class ExercicioDevStore {

    // PROCEDIMENTO: só mostra o nome do sistema
    static void exibirCabecalho() {
        System.out.println("DevStore - Sistema de Gestao de Caixa e Vendas");
    }

    // FUNÇÃO: devolve preço vezes quantidade
    static double calcularSubtotal(double preco, int quantidade) {
        return preco * quantidade;
    }

    // FUNÇÃO: devolve o valor do desconto conforme o tipo de cliente
    static double calcularDesconto(double subtotal, int tipoCliente) {
        double taxa = 0;

        if (tipoCliente == 2) {
            taxa = 0.10;
        }
        if (tipoCliente == 3) {
            taxa = 0.15;
        }

        double desconto = subtotal * taxa;
        return desconto;
    }

    // FUNÇÃO: devolve 5% do valor já com desconto
    static double calcularImposto(double valorComDesconto) {
        double imposto = valorComDesconto * 0.05;
        return imposto;
    }

    // PROCEDIMENTO: só imprime os totais
    static void exibirComprovante(double totalBruto, double totalDesconto,
                                  double totalImposto, double valorFinal) {
        System.out.println("Total bruto: " + totalBruto);
        System.out.println("Desconto: " + totalDesconto);
        System.out.println("Imposto: " + totalImposto);
        System.out.println("Valor final: " + valorFinal);
    }

    // MÓDULO PRINCIPAL: lê os dados e chama os módulos
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        exibirCabecalho();

        System.out.print("Preco do produto 1: ");
        double preco1 = sc.nextDouble();
        System.out.print("Quantidade do produto 1: ");
        int quantidade1 = sc.nextInt();

        System.out.print("Preco do produto 2: ");
        double preco2 = sc.nextDouble();
        System.out.print("Quantidade do produto 2: ");
        int quantidade2 = sc.nextInt();

        System.out.print("Preco do produto 3: ");
        double preco3 = sc.nextDouble();
        System.out.print("Quantidade do produto 3: ");
        int quantidade3 = sc.nextInt();

        System.out.print("Tipo de cliente (1-Comum, 2-VIP, 3-Funcionario): ");
        int tipoCliente = sc.nextInt();

        double subtotal1 = calcularSubtotal(preco1, quantidade1);
        double subtotal2 = calcularSubtotal(preco2, quantidade2);
        double subtotal3 = calcularSubtotal(preco3, quantidade3);

        double totalBruto = subtotal1 + subtotal2 + subtotal3;
        double totalDesconto = calcularDesconto(totalBruto, tipoCliente);
        double valorComDesconto = totalBruto - totalDesconto;
        double totalImposto = calcularImposto(valorComDesconto);
        double valorFinal = valorComDesconto + totalImposto;

        exibirComprovante(totalBruto, totalDesconto, totalImposto, valorFinal);
    }
}