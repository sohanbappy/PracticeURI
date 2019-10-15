package practice1;

import java.util.Scanner;

public class Uri1071 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int start,end;
        int sum = 0;
        if(m>n){
            start = n;
            end = m;
        }else{
            start = m;
            end = n;
        }

        for(int i=start;i<end;i++){
            if(i%2==1){
                if(sum>=end){
                    sum=i;
                }else {
                    sum += i;
                }
            }
            if(sum>=end){
                sum=i;
            }
        }
        System.out.println(sum);
        scanner.close();
    }
}
