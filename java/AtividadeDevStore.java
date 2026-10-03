import java.util.Scanner;

public class AtividadeDevStore {

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

    // PROCEDIMENTO extra: escreve que tipo de cliente é
    static void exibirTipoCliente(int tipoCliente) {
        if (tipoCliente == 1) {
            System.out.println("Voce e um cliente comum.");
        }
        if (tipoCliente == 2) {
            System.out.println("Voce e um cliente VIP.");
        }
        if (tipoCliente == 3) {
            System.out.println("Voce e um funcionario.");
        }
    }

    // PROCEDIMENTO: escreve o resultado final em frases
    static void exibirComprovante(double totalBruto, double totalDesconto,
                                  double totalImposto, double valorFinal) {
        System.out.println("Sua compra foi de R$ " + totalBruto + ".");
        System.out.println("Voce recebeu R$ " + totalDesconto + " de desconto.");
        System.out.println("O imposto municipal foi de R$ " + totalImposto + ".");
        System.out.println("O valor final a pagar e R$ " + valorFinal + ".");
        System.out.println("Obrigado pela preferencia!");
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

        System.out.println();
        exibirTipoCliente(tipoCliente);
        exibirComprovante(totalBruto, totalDesconto, totalImposto, valorFinal);
    }
}