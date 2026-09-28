import java.util.Scanner;
public class Exercicio22DoWhile {

    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        int opçao;
        do{
            System.out.println("1- ver saldo");
            System.out.println("2- Fazer deposito");
            System.out.println("3- sair");
            opçao = leia.nextInt();

        } while (opçao != 3);
    }

}
