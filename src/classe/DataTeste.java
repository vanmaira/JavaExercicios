package classe;

public class DataTeste {
    public static void main(String[] args) {

      Data data1 = new Data();
      data1.ano = 2021;

      Data data2 = new Data();
      data2.dia = 23;
      data2.mes = 04;
      data2.ano = 1985;

        System.out.println(data1.dia);
        System.out.println(data2.ano);

      System.out.println(data1.obterData());

      String dataFormatada1 = data2.obterData();
      System.out.println(dataFormatada1);

    }
}
