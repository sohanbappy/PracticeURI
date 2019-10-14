package practice1;

import java.util.Scanner;

public class Uri1159 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while(n!=0){
            //for odd
            if (n%2!=0) {
                n = n+1;
            }
            int sum=0;
            for (int i = n; i <= (n + 8); i += 2) {
                sum += i;
            }
            System.out.println(sum);
            n = scanner.nextInt();
        }

        scanner.close();
    }
}
