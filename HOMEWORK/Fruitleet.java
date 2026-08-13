import java.util.*;

public class Fruitleet{

    public static int totalFruit(int[] fruits) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int left = 0;
        int max = 0;

        for (int right = 0; right < fruits.length; right++) {

            map.put(fruits[right],
                    map.getOrDefault(fruits[right], 0) + 1);

            while (map.size() > 2) {

                map.put(fruits[left],
                        map.get(fruits[left]) - 1);

                if (map.get(fruits[left]) == 0) {
                    map.remove(fruits[left]);
                }

                left++;
            }

            max = Math.max(max, right - left + 1);
        }

        return max;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of fruits: ");
        int n = sc.nextInt();

        int[] fruits = new int[n];

        System.out.println("Enter fruit types:");

        for (int i = 0; i < n; i++) {
            fruits[i] = sc.nextInt();
        }

        int result = totalFruit(fruits);

        System.out.println("Maximum fruits = " + result);

        sc.close();
    }
}