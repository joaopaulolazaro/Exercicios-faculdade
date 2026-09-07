import java.util.Scanner;


public class Exercicio01Temperatura{




    public static void main(String[] args){

        double temperatura;

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite a temperatura: ");

        temperatura = leia.nextDouble();

        if (temperatura>= 28){
              System.out.println(" Ligar ar-condicionado.");
        }
         else{
             System.out.println("Temperatura agradável!. ");
        }
    }
}