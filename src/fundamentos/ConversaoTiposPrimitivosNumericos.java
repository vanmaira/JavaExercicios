package fundamentos;

public class ConversaoTiposPrimitivosNumericos {
    public static void main(String[] args) {

        //implicita
        double a = 1.9876554333344;
        System.out.println(a);

        //cast - explicita
        float b = (float) 1.9876554333344;
        System.out.println(b);

        int c = 4;
        byte d = (byte)c;
        System.out.println(d);
    }
}
