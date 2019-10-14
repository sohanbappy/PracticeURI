package practice1;

import java.util.Scanner;

public class Uri1133 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m,n;
        m = scanner.nextInt();
        n = scanner.nextInt();
        if (m >= 0 && n >= 0) {
            if (m > n) {
                for (int i = n; i < m; i++) {
                    if ((i % 5 == 2) || (i % 5 == 3)) {
                        System.out.println(i);

                    }
                }
            } else {
                for (int i = m; i < n; i++) {
                    if ((i % 5 == 2) || (i % 5 == 3)) {
                        System.out.println(i);

                    }
                }
            }
        }
        scanner.close();
    }
}
