package fundamentos;

import java.util.Locale;

public class NotacaoPonto {
    public static void main(String[] args) {

        double a = 2.3;
        String s = "Bom dia, X";
        s = s.toUpperCase();
        System.out.println(s);
        s = s.replace("X", "Senhora");
        System.out.println(s);
        s = s.concat("!");
        System.out.println(s);

        System.out.println("Vanessa".toUpperCase());

        String y = "Bom dia, X"
                .replace("X", "Van")
                .toUpperCase()
                .concat("!");

        System.out.println(y);
    }
}
