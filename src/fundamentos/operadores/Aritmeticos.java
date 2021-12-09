package fundamentos.operadores;

public class Aritmeticos {
    public static void main(String[] args) {
        System.out.println(2+3);

        var x = 34.56;
        double y = 2.2;

        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
        System.out.println(x/y);

        int a = 8;
        int b = 3;

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a/(double) b);

        System.out.println(8%3);
        System.out.println(a%b);


    }

    public static class DesafioAritmeticos {
        public static void main(String[] args) {

            int as = 2+3+4;
            int bs = (int) Math.pow(as,3);
            System.out.println(bs);

            int a = 6*(3+2);
            int a1 = (int) Math.pow(a,2);
            int a2 = a1/(3*2);

            int b = ((1-5)*(2-7))/2;
            int b1 = (int) Math.pow(b,2);

            int c = a2 - b1;
            int c1 = (int) Math.pow(c, 3);

            int d = (int) Math.pow(10,3);

            int e = c1/d;

            System.out.println(e);


        }
    }
}
