public class LongestCommonPrefix {
    public static void main(String[] args) {
        SolutionLCP sol = new SolutionLCP();

        // Probamos varios casos como si estuviéramos en LeetCode, pero desde consola
        System.out.println("Caso 1 → " + sol.longestCommonPrefix(new String[]{"flower", "flow", "flight"}));   // devuelve: fl
        System.out.println("Caso 2 → " + sol.longestCommonPrefix(new String[]{"dog", "racecar", "car"}));     // devuelve: ""
        System.out.println("Caso 3 → " + sol.longestCommonPrefix(new String[]{"mate", "materia", "matriz"})); // devuelve: mat
        System.out.println("Caso 4 → " + sol.longestCommonPrefix(new String[]{"hola"}));                      // devuelve: hola
        System.out.println("Caso 5 → " + sol.longestCommonPrefix(new String[]{}));                            // devuelve: ""
    }
}


class SolutionLCP {
    public String longestCommonPrefix(String[] strs) {
        // Si no hay palabras, devolvemos vacío al toque
        if (strs == null || strs.length == 0) return "";

        // Arrancamos pensando que toda la primera palabra puede ser el prefijo
        String prefijoX = strs[0];

        for (int i = 1; i < strs.length; i++) {
            // Mientras la palabra no arranque con prefijoX, lo vamos achicando
            while (!strs[i].startsWith(prefijoX)) {
                prefijoX = prefijoX.substring(0, prefijoX.length() - 1);

                // Si ya no quedó nada, listo: no comparten prefijo
                if (prefijoX.isEmpty()) return "";
            }
        }

        // Lo que haya sobrevivido es el prefijo verdadero
        return prefijoX;
    }
}
