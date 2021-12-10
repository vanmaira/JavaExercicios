package fundamentos.operadores;

public class DesafioLogicos {
    public static void main(String[] args) {

        //trabalho na terça (v ou f)
        //trabalho na quinta (v ou f)
        // se os dois v = tv 50
        // um v = tv 32
        // ambos tomar sorvete
        //ambos f = ficar em casa

        boolean trabalho1 = true;
        boolean trabalho2 = true;

        System.out.print(trabalho1 && trabalho2);
        System.out.println(" TV 50 e sorvetinho");

        System.out.print(trabalho1 || trabalho2);
        System.out.println(" TV 32 e sorvetinho");

        System.out.print(trabalho1 || !trabalho2);
        System.out.println(" TV 32 e sorvetinho");

        System.out.print(!trabalho1 && !trabalho2);
        System.out.println(" ficar em casa e fazer dieta");


    }
}
