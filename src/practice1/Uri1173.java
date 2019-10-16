package practice1;

import java.util.Scanner;

public class Uri1173 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[10];
        if(n<50) {
            for (int i = 1; i <= 10; i++) {
               a[i-1] = (i*n);
            }
        }
        for (int j = 1; j <= 10; j++) {
            System.out.println("N[" + (j-1) + "] = " + (a[j-1] * n));
        }
        scanner.close();
    }
}
