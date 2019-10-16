package practice1;

import java.util.Scanner;

public class Uri1172 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[10];

        for(int i=0;i<10;i++){
            a[i] = scanner.nextInt();
        }

        for(int j=0;j<10;j++){
            if(a[j]<=0){
                System.out.println("X["+j+"] = "+1);
            }else{
                System.out.println("X["+j+"] = "+a[j]);
            }
        }

        scanner.close();
    }
}
