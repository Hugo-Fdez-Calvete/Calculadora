public class Calculadora {
    public static void main(String[] args) {
	Resta r = new Resta();
	System.out.println("Resultado resta: " + r.restar(10, 4));
        Suma s = new Suma();
        System.out.println("Resultado suma: " + s.sumar(5, 3));
    }
}