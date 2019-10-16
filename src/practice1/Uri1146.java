package practice1;

import java.util.Scanner;

public class Uri1146 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while (n != 0) {
            for (int i = 1; i <= n; i++) {
                    if (i==n) {
                        System.out.print(i);
                        break;
                    }
                System.out.print(i+" ");
                }
            System.out.println();
            n = scanner.nextInt();
            }
        scanner.close();
    }
}
