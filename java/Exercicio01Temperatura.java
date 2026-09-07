import java.util.Scanner;

<<<<<<<< HEAD:java/Exercicio1Temperatura.java
public class Exercicio1Temperatura {
========
public class Exercicio01Temperatura {
>>>>>>>> 9055332862fd9024ff8135d7c5fd715ad7e959c1:java/Exercicio01Temperatura.java

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