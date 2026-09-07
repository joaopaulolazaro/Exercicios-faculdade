import java.util.Scanner;

public class Exercicio10CadastroDeFuncionario {

    public static void main(String[] args){

        String nome;
        double salario;

        Scanner leia = new Scanner(System.in);

        System.out.println("Como você se chama: ");
        nome = leia.next();

        System.out.println("Qual o valor do seu salario: ");
        salario = leia.nextDouble();

        if (salario >= 3000){
            System.out.println("Faixa salarial alta.");

        }else {
            System.out.println("Faixa salarial basica.");
        }
    }
}
