import java.util.Scanner;
public class Exercicio20While {

    public static void main(String[] args){
        int numero = 0;
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        numero = leia.nextInt();
        while (numero != 0){
           System.out.println("Digite outro numero):");
           numero = leia.nextInt();
        }
     System.out.println("Programa encerrado!");
    }
}

