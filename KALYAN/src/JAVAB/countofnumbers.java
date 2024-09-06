package JAVAB;

import java.util.HashMap;

public class countofnumbers {

    public static void main(String[] args) {

        int a[] = { 2, 3, 4, 8, 4, 2, 8, 3, 4, 5,5,5,5 };
        int l = a.length;

        // HashMap to store the count of each number
        HashMap<Integer, Integer> countMap = new HashMap<>();

        for (int i = 0; i < l; i++) {
            // Increment the count for each number in the array
            if (countMap.containsKey(a[i])) {
                countMap.put(a[i], countMap.get(a[i]) + 1);
            } else {
                countMap.put(a[i], 1);
            }
        }

        // Print the count of each number
        for (int num : countMap.keySet()) {
            System.out.println("Number " + num + " occurs " + countMap.get(num) + " times.");
        }
    }
}
