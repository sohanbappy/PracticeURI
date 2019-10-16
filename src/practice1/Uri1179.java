package practice1;

import java.util.Scanner;

public class Uri1179 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int x;
        for(int i=0;i<input;i++){
            x = scanner.nextInt();
            if(x>=0 && x<=60) {
                System.out.println("Fibo(" + x + ") = " + findLastFibo(x));
            }
        }


        scanner.close();
    }
    static int findLastFibo(int number){
        int last =0,now=1,previous=0;
        if(number==0){
            return 0;
        }else if(number==1 || number==2){
            return 1;
        }else {
            for (int i = 2; i <= number; i++) {
                last = now + previous;
                previous = now;
                now = last;
            }
            return last;
        }
    }
}
