package fundamentos.operadores;

public class Atribuicao {

    public static void main(String[] args) {

        int a = 3;
        int b = a;
        int c = a + b;

        c = c + b;
        System.out.println(c);
        c += b;
        System.out.println(c);
        c -= a;
        System.out.println(c);
        c *= b;
        System.out.println(c);
        c /= a;
        System.out.println(c);
        c %= 2; //0 (par) ou 1 (impar)
        System.out.println(c);

    }
}
