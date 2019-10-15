package practice1;

import java.util.Scanner;

public class Uri1070 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n%2==0){
            n+=1;
        }
        for(int i = n;i<=(n+10);i+=2){
            System.out.println(i);
        }
        scanner.close();
    }
}
