import java.util.Scanner;

public class Exercicio11ControleDeEstoque {

    public static void main(String[] args){

        int quantidade;

        Scanner leia = new Scanner(System.in);

       System.out.println("Qual a quantidade de produtos disponíveis:");
        quantidade = leia.nextInt();

        if (quantidade < 10){
            System.out.println(" Reposição necessária");


        } else {
            System.out.println(" Estoque adequado");

        }











    }























}
