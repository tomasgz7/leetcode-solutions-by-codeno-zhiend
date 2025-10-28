import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};

            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No se encontró una solución");
    }

    public static void main(String[] args) {

        int [] nums = {2, 7, 11, 15};

        int target = 9;

        int [] resultado = twoSum(nums, target);

        System.out.println("Los números que suman " + target + " son:");
        System.out.println(nums[resultado[0]] + " y " + nums[resultado[1]]);
        System.out.println("Están en las posiciones " + resultado[0] + " y " + resultado[1] + " dentro de la lista.");
    }
}