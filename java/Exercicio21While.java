import java.util.Scanner;
public class Exercicio21While {

    public static void main(String[] args){
        int senha;
        Scanner leia = new Scanner(System.in);

        System.out.println("Qual é a senha: ");
        senha = leia.nextInt();


        while (senha != 2025){
            System.out.println("Senha inválida:");
            senha = leia.nextInt();
        }
        System.out.println("Acesso liberado!");

}

}
