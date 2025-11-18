public class Division {
    public double dividir(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("No se puede dividir entre 0");
        }
        return a / b;
    }
}