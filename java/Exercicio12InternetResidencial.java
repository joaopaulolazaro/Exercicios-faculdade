import java.util.Scanner;

public class Exercicio12InternetResidencial {

    public static void main(String[] args){

        int velocidade;

        Scanner leia = new Scanner(System.in);

        System.out.println("Qual é a velociadede: ");
        velocidade = leia.nextInt();

        if (velocidade >= 100){
            System.out.println("Plano adequado para streaming.");

        } else {
            System.out.println("Considere aumentar o plano.");
        }
    }


}
