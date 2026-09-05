import java.util.Scanner;

public class Exercicio3VerificacaoDeMaioridade {
    public static void main(String[] args){

        String nome;
        int idade;

        Scanner leia = new Scanner(System.in);

        System.out.println(" Digite seu nome:");
        nome = leia.next();
        System.out.println(" Digite sua idade: ");
        idade = leia.nextInt();

        if ( idade >= 18){
            System.out.println(" Participação autorizada. ");

        }
        else{
            System.out.println("Necessárisa autorização dos responsáveis. ");
        }
    }

}
