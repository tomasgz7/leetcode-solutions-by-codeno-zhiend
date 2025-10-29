public class PalindromeNumber {
    public static void main(String[] args) {
        int x = 121;
        boolean resultado = isPalindrome(x);
        System.out.println("¿" + x + " es palíndromo? " + resultado);
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) return false;
        String s = String.valueOf(x);
        String reversed = new StringBuilder(s).reverse().toString();
        return s.equals(reversed);
    }
}
