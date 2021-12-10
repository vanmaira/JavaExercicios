package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
    public static void main(String[] args) {
        //ler num1
        //ler num2
        //digitar a operação + - * / %
        //executar a operação e mostrar o resultado

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro número");
        double num1 = scan.nextDouble();
        System.out.println("Digite o segundo número");
        double num2 = scan.nextDouble();
        System.out.println("digitar a operação + - * / %");
        String oper = scan.next();

        double resul = "+".equals(oper) ? num1 + num2 : 0;
        resul = "-".equals(oper) ? num1 - num2 : resul;
        resul = "*".equals(oper) ? num1 * num2 : resul;
        resul = "/".equals(oper) ? num1 / num2 : resul;
        resul = "%".equals(oper) ? num1 % num2 : resul;

        System.out.println("Resposta: " + resul);
        scan.close();
    }
}
