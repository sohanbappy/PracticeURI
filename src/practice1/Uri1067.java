package practice1;

import java.util.Scanner;

public class Uri1067 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i=1;i<=n;i++){
            if(i%2==1){
                System.out.println(i);
            }
        }
        scanner.close();
    }
}
