package silver;

import java.util.*;

public class _1978 {
    public static boolean is_prime(int x) {
        if (x <= 1)
            return false;
        else if (x == 2)
            return true;
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while (n-- > 0) {
            if (is_prime(sc.nextInt()))
                count++;
        }
        System.out.println(count);
    }
}
