import java.util.Scanner;

public class Exercicio15Academia {

    public static void main(String[] args){

        String nome;
        double idade;

        Scanner leia = new Scanner(System.in);

        System.out.println(" Digite o seu nome: ");
        nome = leia.next();

        System.out.println(" Digite a sua idade: ");
        idade = leia.nextDouble();

        if (idade >= 16){
            System.out.println(" Matricula permitida. ");

        }
        else {
            System.out.println(" Matricula não permitida.");
        }

    }











}
