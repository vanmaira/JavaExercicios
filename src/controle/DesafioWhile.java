package controle;

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int qtdeNotas = 0;
        double nota = 0;
        double total = 0;

        while (nota != -1){
            System.out.println("Informe a nota (ou -1 pra sair):");
            nota = scan.nextDouble();
            if (nota <= 10 && nota >= 0){
                total += nota;
                qtdeNotas++;
            } else if (nota != -1){
                System.out.println("Nota inválida!");
            }


        }
        double media = total / qtdeNotas;
        System.out.println("Média: " + media);

        scan.close();


    }
}
