package controle;

public class BreakRotulado {
    public static void main(String[] args) {

        //não é recomendado, o código não fica claro - nem usando break nem continue!

        externo:for (int i = 0; i < 3; i++){
          interno:  for (int j = 0; j < 3; j++){
                if (i ==1){
                    break externo;
                }
                System.out.printf("|i = %d j = %d|", i, j);
            }
            System.out.println();
        }
        System.out.println("Fim!");
    }
}
