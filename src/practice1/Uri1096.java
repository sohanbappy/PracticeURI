package practice1;

import java.util.Scanner;

public class Uri1096 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i,j;
        for(i=1;i<=9;i+=2){
            for(j=7;j>=5;j--){
                System.out.println("I="+i+" J="+j);
            }
        }


        scanner.close();
    }
}
