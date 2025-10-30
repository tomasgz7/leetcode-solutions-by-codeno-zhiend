public class RemoveZerosInDecimalRepresentation {
    public static void main(String[] args) {
        long n = 1020030;
        String s = String.valueOf(n);
        String sinCeros = s.replace("0", "");
        long resultado = Long.parseLong(sinCeros);

        System.out.println("Número base: " + n);
        System.out.println("Número sin los ceros: " + resultado);
    }
}
