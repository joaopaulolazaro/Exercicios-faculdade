import java.util.Scanner;

public class Exercicio08MediaEscolar {

    public static void main(String[] args){

        double nota1, nota2, media;
        Scanner leia = new Scanner(System.in);

        System.out.println(" Digite nota 1: ");
        nota1 = leia.nextDouble();
        System.out.println(" Digite nota 2: ");
        nota2 = leia.nextDouble();

        media = (nota1 + nota2)/2;

        if (media >= 60){
            System.out.println("Aprovado");
        }

        else{
            System.out.println("Reprovado");
        }
    }
}
