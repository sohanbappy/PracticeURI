package practice1;

import java.util.Scanner;

public class Uri1065 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter =0;
        int n;
        for(int i=0;i<5;i++){
            n = scanner.nextInt();
            if(n%2==0){
                counter++;
            }
        }
        System.out.println(counter+" valores pares");
        scanner.close();
    }
}
