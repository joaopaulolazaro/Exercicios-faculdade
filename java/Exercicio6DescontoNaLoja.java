import java.util.Scanner;

public class Exercicio6DescontoNaLoja {

    public static void main(String[] args){
        double valor, valor_final, desconto;

        Scanner leia = new Scanner(System.in);

        System.out.println(" Digite o valor da compra: ");
        valor = leia.nextDouble();

        if (valor > 200){
            desconto = valor * 10/100;
            valor_final = valor - desconto;


        }   else {
            System.out.println(" Sem desconto");
            valor_final = valor;


        }
        System.out.println(" Valor_final: " + valor_final);
    }
}


