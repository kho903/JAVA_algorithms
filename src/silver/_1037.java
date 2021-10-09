package silver;

import java.util.*;

public class _1037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int min, max;
        min = max = a[0];
        for (int i = 1; i < n; i++) {
            if (min > a[i])
                min = a[i];
            if (max < a[i])
                max = a[i];
        }
        System.out.println(min * max);
    }
}