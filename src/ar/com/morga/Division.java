package ar.com.morga;

public class Division {
    public static double divisionEntera(double num1, double num2) {
        double resultado = 0;
        while (num1 >= num2) {
            num1 -= num2;
            resultado++;
        }
        return resultado;
    }

    public static double divisionPrecisa(double num1, double num2) {
        return num1 / num2;
    }
}
