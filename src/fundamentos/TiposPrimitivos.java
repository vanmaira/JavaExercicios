package fundamentos;

public class TiposPrimitivos {
    public static void main(String[] args) {
        //info do funcionario
        byte anosDeEmpresa = 23;
        short numeroDeVoos = 542;
        int id = 56789;
        long pontosAcumulados = 3_234_845_223L;
        float salario = 11_445.44F;
        double vendasAcumuladas = 2_991_797.01;
        boolean estaDeFerias = false;
        char ativo = 's';

        // dias de empresa
        System.out.println(anosDeEmpresa*365);

        //numero de viagens
        System.out.println(numeroDeVoos/2);

        //pontos por real
        System.out.println(pontosAcumulados/vendasAcumuladas);

        System.out.println("ganha ->" + salario);
        System.out.println("ferias?" + estaDeFerias);
        System.out.println("ativo?" + ativo);


    }
}
