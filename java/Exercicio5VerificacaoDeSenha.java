import java.util.Scanner;

public class Exercicio5VerificacaoDeSenha {

    public static void main(String[] args){
        final int senha_correta = 1234;
        int senha_digitada;

        Scanner leia = new Scanner(System.in);

        System.out.println(" Digite a sua senha. ");
        senha_digitada = leia.nextInt();

        if (senha_digitada==senha_correta){
            System.out.println(" Acesso Permitido. ");
        }
        else{
            System.out.println(" Acesso negado. ");



        }
    }
}







