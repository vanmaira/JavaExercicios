package controle;

import java.util.Scanner;

public class DesafioDiaSemana {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o dia da semana");
        String dia = scan.next();

        if (dia.equalsIgnoreCase("segunda")){
            System.out.println(2);
        } else if (dia.equalsIgnoreCase("terça")){
            System.out.println(3);
        } else if (dia.equalsIgnoreCase("quarta")){
            System.out.println(4);
        } else if (dia.equalsIgnoreCase("quinta")){
            System.out.println(5);
        } else if (dia.equalsIgnoreCase("sexta")){
            System.out.println(6);
        } else if (dia.equalsIgnoreCase("sábado")){
            System.out.println(7);
        } else if (dia.equalsIgnoreCase("domingo")){
            System.out.println(1);
        }



        scan.close();

    }
}
