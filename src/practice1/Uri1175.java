package practice1;

import java.util.Scanner;

public class Uri1175 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[20];

        for(int i=0;i<20;i++){
            a[i]  = scanner.nextInt();
        }

        int j=19;

        for(int i=0;i<20;i++){
            System.out.println("N["+i+"] = "+a[j]);
            j--;
        }



        scanner.close();
    }
}
