package practice1;

import java.util.Scanner;

public class Uri1078 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n>2 && n<1000) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i + " x " + n + " = " + (i * n));
            }
        }

        scanner.close();
    }
}
