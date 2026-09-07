import java.util.Scanner;

public class Exercicio13ControleDePresenca {

    public static void main(String[] args){

        int aulas, faltas;
        double frequencia;

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite a quantidade de aulas: ");
        aulas = leia.nextInt();

        System.out.println("Digite a quantidade de faltas: ");
        faltas = leia.nextInt();

        frequencia = ((aulas - faltas) * 100) / aulas;

        if (frequencia >= 75){
            System.out.println("Frequencia suficiente.");
        }
        else {
            System.out.println("Frequencia insuficiente.");
        }

        }


    }

