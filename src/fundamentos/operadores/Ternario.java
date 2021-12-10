package fundamentos.operadores;

public class Ternario {
    public static void main(String[] args) {

        double media = 8.6;
        String resultadoParcial = media >= 5.0 ? "em Recuperação" : "Reprovado";
        String resultado = media > 7.0 ? "Aprovado" : resultadoParcial;
        System.out.println("O aluno está " + resultado);

        double nota = 9.9;
        boolean bomComportamento = false;
        boolean passouMedia = nota >= 7.0;
        boolean temDesconto = bomComportamento && passouMedia;
        String result = temDesconto ? "Sim" : "Não";
        System.out.println("Tem desconto? " + result);



    }
}
