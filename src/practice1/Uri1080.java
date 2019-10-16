package practice1;

import java.util.Scanner;

public class Uri1080 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int max=0,position=1;
        for(int i=1;i<=100;i++){
            n = scanner.nextInt();
            if(n>=0) { //checking positive
                if (n > max) {
                    max = n;
                    position = i;
                }
            }
        }
        System.out.println(max);
        System.out.println(position);
        scanner.close();
    }
}
