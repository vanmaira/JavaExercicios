package controle;

import javax.swing.*;

public class IfElse {
    public static void main(String[] args) {

        String valor = JOptionPane.showInputDialog("informe o número");
        int numero = Integer.parseInt(valor);

        if (numero % 2 == 0){
            System.out.println("é par");
        }
        if (numero % 2 == 1){
            System.out.println("é impar");
        }
    // else
        if (numero % 2 == 0){
            System.out.println("é par");
        } else {
            System.out.println("é impar");
        }

    }
}
