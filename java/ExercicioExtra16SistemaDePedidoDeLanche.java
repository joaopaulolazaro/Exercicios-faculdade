import java.util.Scanner;

public class ExercicioExtra16SistemaDePedidoDeLanche {


    public static void main(String[] args){

        String nome;
        int quantidade;
        double valor, total, valor_final, desconto;

        Scanner leia = new Scanner(System.in);

        System.out.println(" Digite o seu nome: ");
        nome = leia.nextLine();

        System.out.println(" Qual a quantidade de hamburgues: ");
        quantidade = leia.nextInt();

        System.out.println(" Qual é o valor unitário dos hamburgues: ");
        valor = leia.nextDouble();

        total = quantidade * valor;

        if(total >= 50){
            desconto = total *5/100;
            valor_final = total - desconto;

        } else {
            desconto = 0;
            valor_final = total;
        }

        System.out.println(" nome: " + nome);
        System.out.println(" total: " + total);
        System.out.println(" desconto: " + desconto);
        System.out.println(" valor_final: " + valor_final);










    }
}
