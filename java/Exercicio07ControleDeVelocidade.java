import java.util.Scanner;

public class Exercicio07ControleDeVelocidade {

    public static void main(String[] args){
        double velocidade;

        Scanner leia = new Scanner(System.in);

        System.out.println(" Digite a velocidade: ");
        velocidade = leia.nextDouble();

        if (velocidade > 60){
            System.out.println(" Acima da velocidade permitida");


        } else{
            System.out.println(" Velocidade dentro do limite");
        }



    }









}
