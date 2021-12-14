package controle;

public class Continue {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 1) {
                continue;
            }
            System.out.println(i);

            for (int a = 0; a <=10; a++){
                if (a == 5){
                    continue;
                }
                System.out.println(a);
            }
        }
    }
}
