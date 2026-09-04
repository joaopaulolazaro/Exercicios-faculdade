import java.util.Scanner;

public class Exercicio2ComprasDeSupermercado {

    public static void main(String[] args){

        String produto;
        double valor;

        Scanner leia = new Scanner(System.in);

        System.out.println("Quantos produtos você está comprando: ");
        produto = leia.next();

        System.out.println("Qual o valor total dos produtos: ");
        valor = leia.nextDouble();

        if(valor> 100){
            System.out.println(" Você ganhou frete gratis: ");
        }
         else{
             System.out.println("Frete não disponível. ");
        }
    }
}
