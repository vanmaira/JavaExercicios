package fundamentos;

public class ConversorTemperatura {
    public static void main(String[] args) {
        double temp = 100;
        final int n1 = 32;
        final double n2 = 5/9.0;
        double result = (temp - n1) * n2;
        System.out.printf("%f Farenheit em graus Celsius é %f°C", temp, result);
    }
}
