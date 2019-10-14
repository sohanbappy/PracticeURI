package practice1;

import java.util.Scanner;

public class Uri1151 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum =0,now=1,previous=0;
        System.out.print(previous+" "+now);
         for (int i=2;i<n;i++){
                sum = now + previous;
                System.out.print(" "+sum); //problem is Space
                previous = now;
                now = sum;
         }
        scanner.close();
    }
}
