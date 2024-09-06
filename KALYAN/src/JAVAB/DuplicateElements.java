package JAVAB;

public class DuplicateElements {
    public static void main(String[] args) {
        int[] a = {1, 6, 2, 3, 4, 5, 9, 6, 9, 1, 5, 5, 5};
        System.out.println("Duplicate elements in the array are:");

        for (int i = 0; i < a.length; i++) {
            int count = 0;
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++;
                }
            }
            if (count > 0) {
                System.out.println(a[i]);
            }
        }
    }
}