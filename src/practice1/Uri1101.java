package practice1;

import java.util.Scanner;

public class Uri1101 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m,n;
        m = scanner.nextInt();
        n = scanner.nextInt();
        while(m>0 && n>0){
            int sum = 0;
            int diff = m - n;
            if(diff>=0){
                for(int i=n;i<=m;i++){
                    sum+=i;
                    System.out.print(i+" ");
                }
            }else{
                for(int i=m;i<=n;i++) {
                    sum += i;
                    System.out.print(i+" ");
                }
            }
            System.out.println("Sum="+sum);
            m = scanner.nextInt();
            n = scanner.nextInt();
        }

        scanner.close();
    }
}
