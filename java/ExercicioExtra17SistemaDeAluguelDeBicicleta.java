import java.util.Scanner;

public class ExercicioExtra17SistemaDeAluguelDeBicicleta {

    static final double VALOR_HORA = 8.00;
     public static void main(String[] args){

     String nome;
     double horas, valor_horas, total;

     Scanner leia = new Scanner(System.in);

         System.out.println(" Digite seu nome: ");
         nome = leia.nextLine();

         System.out.println(" Quantas horas utilizadas: ");
         horas = leia.nextDouble();

         total = horas * VALOR_HORA;

         if( total > 50){
             System.out.println(" Cliente premium.");
         }
         else {
             System.out.println("Cliente comum.");
         }

         System.out.println("nome: " + nome);
         System.out.println("horas: " + horas);
         System.out.println("total: " + total);






















     }
}
