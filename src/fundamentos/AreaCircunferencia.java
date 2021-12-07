package fundamentos;

public class AreaCircunferencia {
    public static void main(String[] args) {
        double raio = 3.4;
        final double pi = 3.14;
        double area = pi*(raio*raio);
        int num = 5;
        System.out.println(pi*(raio*raio));
        System.out.println(area);

        raio = 10;
        area = pi * raio * raio;
        System.out.println("área = " + area);
        System.out.printf("a aŕea do círculo de raio %f é %f", raio,area);
        System.out.println();
        System.out.printf("imprimir inteiro é %d e pular linha %n", num);




    }
}
