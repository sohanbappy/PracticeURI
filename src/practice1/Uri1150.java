package practice1;

import java.util.Scanner;

public class Uri1150 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 1;
        int x = scanner.nextInt();
        int z = scanner.nextInt();

        while (x>=z){
            z = scanner.nextInt();
        }
        int sum = x;

        while (sum<=z){
            ++x;
            sum+=x;
            counter++;
        }

        System.out.println(counter);

        scanner.close();
    }
}
