package fundamentos;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Console {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();

        System.out.print("Digite seu sobrenome: ");
        String sobrenome = entrada.nextLine();

        System.out.println("\n\nNome: " + nome + " " + sobrenome);

        System.out.println("Digite sua idade: ");
        int idade = entrada.nextInt();
        System.out.printf("%s %s tem %d anos.", nome, sobrenome, idade);

        entrada.close();

    }
}
