import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println("III : " + sol.romanToInt("III"));
        System.out.println("LVIII : " + sol.romanToInt("LVIII"));
        System.out.println("MCMXCIV : " + sol.romanToInt("MCMXCIV"));
        System.out.println("IX : " + sol.romanToInt("IX"));
        System.out.println("XL : " + sol.romanToInt("XL"));
    }
}

class Solution {

    public int romanToInt(String s) {
        // Equivalencias romanas
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0;

        // Recorremos la cadena menos el último símbolo
        for (int i = 0; i < s.length() - 1; i++) {
            int actual = romanMap.get(s.charAt(i));
            int siguiente = romanMap.get(s.charAt(i + 1));

            // Si el actual es menor que el que sigue, se resta; si no, lo suma
            if (actual < siguiente) {
                result -= actual;
            } else {
                result += actual;
            }
        }

        // Sumamos el último carácter que siempre se suma
        result += romanMap.get(s.charAt(s.length() - 1));

        return result;
    }
}
