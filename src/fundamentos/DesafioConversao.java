package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro salario");
        String sal1 = scan.next().replace(",", ".");

        System.out.println("Digite o segundo salario");
        String sal2 = scan.next().replace(",", ".");

        System.out.println("Digite o terceiro salario");
        String sal3 = scan.next().replace(",", ".");

        double vr1 = Double.parseDouble(sal1);
        double vr2 = Double.parseDouble(sal2);
        double vr3 = Double.parseDouble(sal3);

        double media = (vr1+vr2+vr3)/3;

        System.out.printf("A média entre %d, %d, e %d é %.2d", vr1, vr2, vr3, media);

        scan.close();
    }
}
