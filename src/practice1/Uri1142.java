package practice1;

import java.util.Scanner;

public class Uri1142 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int j= -1;
        for (int i=0;i<n;i++){
            System.out.println((j+=2)+" "+(++j)+" "+(++j)+" PUM");
        }
        scanner.close();
    }
}
