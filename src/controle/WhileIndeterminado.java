package controle;

import java.util.Scanner;

public class WhileIndeterminado {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String texto = "";

        while (!texto.equalsIgnoreCase("sair")){
            System.out.println("Digite uma palavra, texto, ou sair");
            texto = scan.nextLine();
        }



        scan.close();
    }
}
