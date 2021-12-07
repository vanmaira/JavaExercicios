package fundamentos;

import java.util.Locale;

public class TipoString {
    public static void main(String[] args) {
        System.out.println("ola, pessoal".charAt(0));

        String s = "Boa tarde";
        System.out.println(s.concat("!"));
        System.out.println(s + "!");
        s = s.toUpperCase();
        System.out.println(s);
        s = "Bom dia";
        System.out.println(s.startsWith("Boa"));
        System.out.println(s.toLowerCase().startsWith("bom"));
        System.out.println(s.endsWith("a"));
        System.out.println(s.equals("Bom dia"));
        System.out.println(s.equalsIgnoreCase("bom dia"));

        var nome = "Pedro";
        var sobrenome = "Santos";
        var idade = 36;
        var salario = 1234.45;

        System.out.printf("%s %s, %d anos, salario de R$ %.2f", nome, sobrenome, idade, salario);

    }
}
