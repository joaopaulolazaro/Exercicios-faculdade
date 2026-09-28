import java.util.Scanner;
public class Exercicio23DoWhile {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        String resposta;

        do{
            System.out.println(" Deseja registrar outro numero? (S/N)");
            resposta = leia.next();
        } while (resposta.equals("S"));

    }
}
