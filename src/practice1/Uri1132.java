package practice1;

import java.util.Scanner;

public class Uri1132 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m,n;
        m = scanner.nextInt();
        n = scanner.nextInt();
        int sum=0;
        if(m>n){
        for(int i=n;i<=m;i++){
            if(i%13==0){
                continue;
            }else{
                sum+=i;
            }
           }
        }else{
            for(int i=m;i<=n;i++){
                if(i%13==0){
                    continue;
                }else{
                    sum+=i;
                }
            }
        }

        System.out.println(sum);
        scanner.close();
    }
}
