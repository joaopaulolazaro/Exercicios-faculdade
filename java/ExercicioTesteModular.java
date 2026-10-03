 import java.util.Scanner;

public class ExercicioTesteModular {

    // PROCEDIMENTO: só imprime, não devolve nada (void)
    static void exibirMenu() {
        System.out.println("=== CONVERSOR DE TEMPERATURA ===");
        System.out.println("1 - Celsius para Fahrenheit");
        System.out.println("2 - Fahrenheit para Celsius");
        System.out.print("Escolha: ");
    }

    // FUNÇÃO: recebe um double, calcula e DEVOLVE um double
    static double celsiusParaFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    // FUNÇÃO: mesma ideia, cálculo contrário
    static double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // PROCEDIMENTO com parâmetros: recebe dados só para imprimir
    static void exibirResultado(double original, double convertido, String unidadeFinal) {
        System.out.println("Resultado: " + original + " -> " + convertido + " " + unidadeFinal);
    }

    // MÓDULO PRINCIPAL: só orquestra, chamando os outros
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        exibirMenu();
        int opcao = sc.nextInt();

        System.out.print("Digite a temperatura: ");
        double valor = sc.nextDouble();

        if (opcao == 1) {
            double resultado = celsiusParaFahrenheit(valor);
            exibirResultado(valor, resultado, "°F");
        } else if (opcao == 2) {
            double resultado = fahrenheitParaCelsius(valor);
            exibirResultado(valor, resultado, "°C");
        } else {
            System.out.println("Opção inválida.");
        }
    }
}

