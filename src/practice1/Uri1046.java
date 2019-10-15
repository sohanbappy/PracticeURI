package practice1;

import java.util.Scanner;

public class Uri1046 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();

        int diff = 0;
        if (start >= 0 && end >= 0) {
            if (end <= start) {
                end += 24;
            }

            diff = end - start;
            System.out.println("O JOGO DUROU " + diff + " HORA(S)");

            scanner.close();
        }
    }
}
