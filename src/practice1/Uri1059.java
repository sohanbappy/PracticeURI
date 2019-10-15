package practice1;

import java.util.Scanner;

public class Uri1059 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for(int i=1;i<=100;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
        scanner.close();
    }
}
